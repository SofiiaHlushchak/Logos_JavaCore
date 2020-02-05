package ua.lviv.lgs;

public class Collection {
    static Number[] arr;

    public Collection(Number[] arr) {
        this.arr = arr;
    }

    public class Forward implements Iterator {
        int count = 0;

        @Override
        public boolean hasNext() {
            return count < arr.length;
        }

        @Override
        public Object next() {
            for (int i = 0; i < arr.length; i++) {
                if ((i % 2) == 0)
                {
                    arr[i] = 0;
                }
            }
            return arr;
        }


    }


    public Forward createForward() {
        return new Forward();
    }

    public class Backward implements Iterator {

        int count = arr.length - 1;

        @Override
        public boolean hasNext() {
            return count >= 0;
        }

        @Override
        public Object next() {
            count -= 2;
            return arr[count + 2];
        }
    }

    public Backward createBackward() {
        return new Backward();
    }


    public Iterator anonim(){
        return new Iterator() {
            int count = arr.length - 1;
            int returnNumber;
            @Override
            public boolean hasNext() {
                return count >= 0;
            }

            @Override
            public Object next() {
                returnNumber=count;
                count-=3;
                if ((int)arr[returnNumber]%2==1||(int)arr[returnNumber]%2==-1){
                    return arr[returnNumber];
                } else {
                    return "";
                }
            }

        };
    }

    public class Local implements Iterator{
        int count = 0;

        @Override
        public boolean hasNext() {
            return count < arr.length;
        }

        @Override
        public Object next() {
             for (int i = 0; i<arr.length; i++) {
                if (i%5==0 && (int)arr[i]%2 == 0){
                 arr[i] = (int)arr[i]-100;
                }
             }
             return arr;
        }
    }
    public Local createLocal() {
        return new Local();
    }

     public static class Static implements Iterator{
          int count = 0;
         @Override
         public boolean hasNext() {
             return count < arr.length;
         }

         @Override
         public Object next() {
             for (int i = 0; i<arr.length; i++){
                 if (i%2== 0 && (int)arr[i] % 2 == 0){
                        arr[i] = 3;
                 }
             }
             return arr;
         }
     }
    public Static createStatic() {
        return new Static();
    }
}
