class TurtleThread extends Thread {
    private Turtle turtle;
    private int id;

    public TurtleThread(int id) {
        this.id = id;
        this.turtle = new Turtle();
    }

    @Override
    public void run() {
        if (id == 0) {
            drawCake();
        } else if (id == 1) {
            drawCandle();
        } else if (id == 2) {
            drawBalloon();
        }
    }
    private void drawCake() {
        // Bottom layer
        turtle.up();
        turtle.setPosition(-100, -90);
        turtle.down();
        turtle.penColor("red");
        turtle.forward(190);
        turtle.left(90);
        turtle.forward(55);
        turtle.left(90);
        turtle.forward(190);
        turtle.left(90);
        turtle.forward(55);
        turtle.left(90);

        // Top layer
        turtle.up();
        turtle.setPosition(-60, -35);
        turtle.down();
        turtle.penColor("deeppink");
        turtle.forward(120);
        turtle.left(90);
        turtle.forward(45);
        turtle.left(90);
        turtle.forward(120);
        turtle.left(90);
        turtle.forward(45);
        turtle.left(90);

        // Decoration wave line on bottom layer
        turtle.up();
        turtle.setPosition(-100, -65);
        turtle.penColor("hotpink");
        turtle.down();
        for (int x = -100; x <= 90; x++) {
            int y = (int) (10 * Math.sin((x + 100) * 0.1) - 65);
            turtle.setPosition(x, y);
        }
    }

    private void drawCandle() {
        turtle.up();
        turtle.setPosition(0, 10);
        turtle.down();
        turtle.penColor("black");
        turtle.left(90);
        turtle.forward(50);
        turtle.right(90);
        turtle.penColor("coral");
        turtle.forward(3.5);
        turtle.left(90);
        for (int i = 0; i < 360; i++) {
            turtle.forward((i % 180 < 90 || i % 180 > 270) ? 0.25 : 0.1);
            turtle.left(1);
        }
        turtle.right(90);
        turtle.forward(3);
        turtle.right(90);
        turtle.penColor("black");
        turtle.forward(50);
    }



    private void drawBalloon() {
        turtle.up();
        turtle.setPosition(-90, 100);
        turtle.down();
        turtle.penColor("blue");
        for (int j = 0; j < 360; j++) {
            turtle.forward(0.3);
            turtle.left(1);
        }
        turtle.up();
        turtle.setPosition(-90, 100);
        turtle.down();
        turtle.penColor("black");
        turtle.setPosition(-90, 50);
    }
}
