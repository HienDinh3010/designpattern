package design.asd.course.pattern.iterator.lesson;

import java.util.*;

public class ApplicationForEach {
    public static void main(String[] args) {
        List<String> alphabet = new ArrayList<>();
        alphabet.add("a");
        alphabet.add("b");
        alphabet.add("c");

//        Iterator<String> iterator = alphabet.listIterator();//External Iterator
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next().toUpperCase());
//        }

//        try {
//            for (String str: alphabet) {
//                if (str.equals("c")) {
//                    alphabet.remove(str);//ConcurrentModificationException
//                }
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
//        alphabet.forEach(l -> {
//            if (l.equals("c")) {
//                alphabet.remove(l);
//            }
//        });
//        alphabet.forEach(l -> System.out.println(l.toUpperCase()));

        Iterator<String> iterator = alphabet.listIterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.equals("c")) {
                iterator.remove();
            }
        }

        iterator = alphabet.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toUpperCase());
        }

        //Iterator does not care about the Collection type
        Collection<Integer> col1 = new ArrayList<>();
        col1.add(1);
        col1.add(2);
        col1.add(3);
        Collection<Integer> col2 = new HashSet<>();
        col2.add(1);
        col2.add(2);
        col2.add(3);
        Collection<Integer> col3 = new LinkedList<>();
        col3.add(1);
        col3.add(2);
        col3.add(3);
        printCollection(col1);
        printCollection(col2);
        printCollection(col3);
    }

    private static void printCollection(Collection<Integer> collection) {
        Iterator<Integer> list = collection.iterator();
        while (list.hasNext()) {
            System.out.println(list.next());
        }
    }
}
