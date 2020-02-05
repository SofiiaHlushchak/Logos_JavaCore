
public class task1{
        public static void main(String[] args) {
            Rectangle r = new Rectangle("Софійка", 4,8);
            System.out.println("Площа прямокутника = " + r.getArea());
            System.out.println("Периметр прямокутника = " + r.getPerimeter());
        }
    }

    class Rectangle  {
        public String name;
        public int weight;
        public int height;
        public int area;
        public int perimeter;
        public Rectangle(String name, int weight, int height){
            System.out.println("Hello");
            this.name=name;
            this.weight=weight;
            this.height=height;
//            this.area= (weight*height);
//            System.out.println(this.area);
        }
public Rectangle(){};

        public int getArea() {
            return (weight * height);

        }

        public int getPerimeter() {
            return (2*weight+2*height);
        }

    }

