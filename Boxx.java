
class BoxDemo{
    private float length;
    private float width;
    private float height;
    private float depth;

    BoxDemo(){
        System.out.println("\nThis is a Box with no dimensions");
    }

    BoxDemo(float len, float wid){
        this.length = len;
        this.width = wid;
        System.out.println("\nThis is a Box with\nLength = "+this.length+"\nWidth = "+this.width);
    }
    BoxDemo(float len, float wid, float hgt){
        this.length = len;
        this.width = wid;
        this.height = hgt;
        System.out.println("\nThis is a Box with\nLength = "+this.length+"\nWidth = "+this.width+"\nHeight = "+this.height+"\n");
    }
    BoxDemo(float len, float wid, float hgt, float dep){
        this.length = len;
        this.width = wid;
        this.height = hgt;
        this.depth = dep;
        System.out.println("\nThis is a Box with\nLength = "+this.length+"\nWidth = "+this.width+"\nHeight = "+this.height+"\nDepth = "+this.depth);
    }
}


class Boxx {
    public static void main(String[] args) {
        BoxDemo b1 = new BoxDemo();
        BoxDemo b2 = new BoxDemo(10, 20);
        BoxDemo b3 = new BoxDemo(10, 20, 30);
        BoxDemo b4 = new BoxDemo(10, 20, 30, 40);

    }
}
