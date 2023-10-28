package lambdaexpression;

public abstract class LambdaExpression implements Drawable, Addable {
    public static void main(String[] args) {
        Drawable d = () -> {
            System.out.println("drawable is working");
        };
        d.draw();
        Addable a = (int x, int y) ->  {
            System.out.println(x+y);
        };
        a.add(121,65);

    }

}
