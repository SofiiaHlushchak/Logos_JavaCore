package ua.lviv.lgs;

import javax.swing.text.html.HTMLDocument;

public class App {
    public static void main(String[] args) {
        Integer [] numbers = {1,1,3,4,54,32412,-1345,-53145,4513,-5151};
        Collection newCollection = new Collection(numbers);
        Collection.Forward ForwardIterator = newCollection.createForward();
//        while (newIterator.hasNext()){
//            System.out.print(newIterator.next()+" ");
//        }
        Integer[] arrayS = (Integer[]) ForwardIterator.next();
        for(int i = 0; i < arrayS.length; i++) {
            System.out.println(arrayS[i]);
        }
        System.out.println();

        Collection.Backward BackwardIterator = newCollection.createBackward(); // -5151 -53145 32412 4 1

        while (BackwardIterator.hasNext()) {
            Integer next = (Integer) BackwardIterator.next();
            System.out.println(next);
        }
        System.out.println();

        Iterator iterator = newCollection.anonim();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println("\n Fifth Element");


        Iterator iteratorFifthElement = newCollection.createLocal();
        Integer[] arrayFifthElement = (Integer[]) iteratorFifthElement.next();
        for(int i = 0; i < arrayFifthElement.length; i++) {
            System.out.println(arrayFifthElement[i]);
        }

        System.out.println("\n Last Task");


        Collection newCollectionForLastTask = new Collection(numbers);

        Iterator iteratorFifthElement1 = newCollectionForLastTask.createStatic();
        Integer[] arrayFifthElement1 = (Integer[]) iteratorFifthElement1.next();
        for(int i = 0; i < arrayFifthElement1.length; i++) {
            System.out.println(arrayFifthElement1[i]);
        }

    }

}
