package counter;

import counter.chainofreponsibility.*;
import counter.command.DecrementCommand;
import counter.command.HistoryList;
import counter.command.IncrementCommand;
import counter.state.CounterState;
import counter.state.SingleDigitState;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameCounter extends JFrame {
    private final JButton jButtonIncrement = new JButton();
    private final JButton jButtondecrement = new JButton();
    private final JButton jButtonundo = new JButton();
    private final JButton jButtonredo = new JButton();
    
    private Counter counter;

    private HistoryList historyList;
    
    private CounterValueReceiver counterValueReceiver;

    public JFrameCounter() {
        try {
            jbInit();
            counter = new Counter();
            TextFrame textframe = new TextFrame(counter);
            textframe.setVisible(true);
            RectFrame rectframe = new RectFrame(counter);
            rectframe.setVisible(true);
            OvalFrame ovalframe = new OvalFrame(counter);
            ovalframe.setVisible(true);
            counter.setTextframe(textframe);
            counter.setRectframe(rectframe);
            counter.setOvalframe(ovalframe);

            //add observers to Subject
            counter.addObserver(textframe);
            counter.addObserver(rectframe);
            counter.addObserver(ovalframe);

            //Command Pattern
            historyList = new HistoryList();

            //State Pattern
            CounterState singleDigitState = new SingleDigitState(counter);
            counter.setCounterState(singleDigitState);
            
            //COR
            counterValueReceiver = new CounterValueReceiver();
            // Create the chain
            OrangeHandler orangeHandler = new OrangeHandler(null);
            BlueHandler blueHandler = new BlueHandler(orangeHandler);
            GreenHandler greenHandler = new GreenHandler(blueHandler);
            RedHandler redHandler = new RedHandler(greenHandler);
            counterValueReceiver.setCounterValueHandler(redHandler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
    	JFrameCounter frame = new JFrameCounter();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = frame.getSize();
        if (frameSize.height > screenSize.height) {
            frameSize.height = screenSize.height;
        }
        if (frameSize.width > screenSize.width) {
            frameSize.width = screenSize.width;
        }
        frame.setLocation( ( screenSize.width - frameSize.width ) / 2, ( screenSize.height - frameSize.height ) / 2 );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setVisible(true);
        
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize(new Dimension(297, 169));
        jButtonIncrement.setText("+");
        jButtonIncrement.setBounds(new Rectangle(30, 25, 73, 22));
        jButtonIncrement.setActionCommand("increment");
        jButtonIncrement.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jButtonIncrement_actionPerformed(e);
                    }
                });
        jButtondecrement.setText("-");
        jButtondecrement.setBounds(new Rectangle(155, 25, 73, 22));
        jButtondecrement.setActionCommand("decrement");
        jButtondecrement.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jButtondecrement_actionPerformed(e);
                    }
                });
        jButtonundo.setText("undo");
        jButtonundo.setBounds(new Rectangle(30, 80, 73, 22));
        jButtonundo.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jButtonundo_actionPerformed(e);
                    }
                });
        jButtonredo.setText("redo");
        jButtonredo.setBounds(new Rectangle(155, 80, 73, 22));
        jButtonredo.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jButtonredo_actionPerformed(e);
                    }
                });
        this.getContentPane().add(jButtonredo, null);
        this.getContentPane().add(jButtonundo, null);
        this.getContentPane().add(jButtondecrement, null);
        this.getContentPane().add(jButtonIncrement, null);
    }

    private void jButtonIncrement_actionPerformed(ActionEvent e) {
      //counter.increment();
        IncrementCommand incrementCommand = new IncrementCommand(counter);
        incrementCommand.execute();
        historyList.addCommand(incrementCommand);

        //COR
        counterValueReceiver.receiveCounter(counter.getCount());
    }

    private void jButtondecrement_actionPerformed(ActionEvent e) {
    	//counter.decrement();
        DecrementCommand decrementCommand = new DecrementCommand(counter);
        decrementCommand.execute();
        historyList.addCommand(decrementCommand);
        
        //COR
        counterValueReceiver.receiveCounter(counter.getCount());
    }

    private void jButtonundo_actionPerformed(ActionEvent e) {
    	System.out.println("undo");
        historyList.undo();
        
        //COR
        counterValueReceiver.receiveCounter(counter.getCount());
    }

    private void jButtonredo_actionPerformed(ActionEvent e) {
    	System.out.println("redo");
        historyList.redo();

        //COR
        counterValueReceiver.receiveCounter(counter.getCount());
    }
}
