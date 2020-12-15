package Rectangle;

public class Rectangle {
    private int left;
    private int top;
    private int width;
    private int height;
    private String copy;

    public Rectangle(int width, int height, int top, int left) {
        this.width = width;
        this.height = height;
        this.left = left;
        this.top = top;
        if (width == height) {
            System.out.println("Создан квадрат т.к Ширина равна Высоте");
            System.out.println("Ширина = " + width);
            System.out.println("Верхняя координата = " + top);
            System.out.println("Левая координата = " + left);
            System.out.println("--------------------------------------");


        }
        if (width != height) {
            System.out.println("Создан прямоугольник с параметрами:");
            System.out.println("Ширина = " + width);
            System.out.println("Высота = " + height);
            System.out.println("Верхняя координата = " + top);
            System.out.println("Левая координата = " + left);
            System.out.println("--------------------------------------");

        }

    }

    public Rectangle(int top, int left) {
        this.top = top;
        this.left = left;
        System.out.println("Вехняя координата = " + top);
        System.out.println("Левая координата = " + left);
        System.out.println("Высота и Ширина не заданы.");
        System.out.println("--------------------------------------");


    }

    public Rectangle(int width, int top, int left) {
        this.width = width;
        this.left = left;
        this.top = top;
        System.out.println("Создан квадрат с параметрами:");
        System.out.println("Ширина = " + width);
        System.out.println("Верхняя координата = " + top);
        System.out.println("Левая координата = " + left);
        System.out.println("--------------------------------------");


    }
    public Rectangle() {

        System.out.println("Создан прямоугольник без параметров:");
        System.out.println("--------------------------------------");


    }

    public Rectangle(Rectangle rectangle) {
        if (rectangle.height > 0 && rectangle.width > 0 && rectangle.left > 0 && rectangle.top > 0 && rectangle.width != rectangle.height) {
            System.out.println("Создана копия с параметрами:");
            System.out.println("Ширина = " + rectangle.width);
            System.out.println("Высота = " + rectangle.height);
            System.out.println("Верхняя координата = " + rectangle.top);
            System.out.println("Левая координата = " + rectangle.left);
            System.out.println("--------------------------------------");

        } else if (rectangle.height == rectangle.width && rectangle.height != 0 && rectangle.top > 0 && rectangle.left > 0) {
            System.out.println("Создан квадрат с параметрами:");
            System.out.println("Ширина = " + rectangle.width);
            System.out.println("Верхняя координата = " + rectangle.top);
            System.out.println("Левая координата = " + rectangle.left);
            System.out.println("--------------------------------------");


        } else if (rectangle.height == 0 && rectangle.width == 0 && rectangle.top > 0 && rectangle.left > 0) {
            System.out.println("Создана копия с параметрами:");
            System.out.println("Вехняя координата = " + rectangle.top);
            System.out.println("Левая координата = " + rectangle.left);
            System.out.println("Высота и Ширина не заданы.");
            System.out.println("--------------------------------------");
        } else if (rectangle.height == 0 && rectangle.width > 0 && rectangle.top > 0 && rectangle.left > 0) {
            System.out.println("Создана квадрат с параметрами:");
            System.out.println("Вехняя координата = " + rectangle.top);
            System.out.println("Левая координата = " + rectangle.left);
            System.out.println("Т.К Высота не задана.");
            System.out.println("--------------------------------------");


        } else if (rectangle.height > 0 && rectangle.width == 0 && rectangle.top > 0 && rectangle.left > 0) {
            System.out.println("Создана квадрат с параметрами:");
            System.out.println("Вехняя координата = " + rectangle.top);
            System.out.println("Левая координата = " + rectangle.left);
            System.out.println("Т.К Ширина не задана.");
            System.out.println("--------------------------------------");
        } else if (rectangle.height == rectangle.width  && rectangle.top == 0 && rectangle.left == 0 && rectangle.height > 0 ) {
            System.out.println("Создана квадрат с параметрами:");
            System.out.println("Высота  = " + rectangle.height + " Равна Ширине");
            System.out.println("Верхняя и Левая точка не задана");
            System.out.println("--------------------------------------");
        }

    }
}
