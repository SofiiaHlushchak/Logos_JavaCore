package ua.lviv.java;

public class Circle {

        public double radius;
        public double diameter;

        Circle() {
            this.radius = 25.4;
            this.diameter = 50.8;
        }

        public void areaCircle() {
            double Pi = 3.141592;
            double S = 0.25 * Pi * (diameter * diameter);
            System.out.println("Площа кола = " + S);
        }

        public void lengthCircle() {
            double Pi = 3.141592;
            double C = 2 * Pi * radius;
            System.out.println("Довжина кола = " + C);
        }


        public static void main(String [] args) {

            Circle c = new Circle();

            System.out.println();
            c.areaCircle();

            System.out.println();
            c.lengthCircle();
        }

    }

