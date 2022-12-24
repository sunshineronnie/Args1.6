public class homeWork {
    public static void main(String[] args) {

        int[] box = new int[3];
        box[0] = 5;
        box[1] = 7;
        box[2] = 3;

        for (int i = 0; i < box.length-1; i++) {
            System.out.print(box[i] + ", ");

        }
        System.out.println(box [box.length-1]);



        double[] box1 = {1.57, 7.654, 9.986};
        for (int i = 0; i < box1.length; i++) {
            if (i == box1.length-1){
                System.out.println(box1[i]);
            } else {
                System.out.print(box1[i] + ", ");
            }

        }

        int[] box2 = {23, 29};
        for (int i = 0; i < box2.length; i++) {
            if (i == box2.length-1){
                System.out.println(box2[i]);
            } else {
                System.out.print(box2[i] + ", ");
            }

        }
        for (int a = box.length-1; a >= 0 ; a--) {
            if (a == 0) {
                System.out.print(box[a]);
            } else {
                System.out.print(box[a] + ", ");
            }


        }
        System.out.println();

        for (int i = box1.length-1; i >= 0 ; i--) {
            if (i == 0) {
                System.out.println(box1[i]);
            } else {
                System.out.print(box1[i] + ", ");
            }


        }




        System.out.println();

        for (int i = box2.length-1; i >= 0 ; i--) {
            if (i == 0) {
                System.out.println(box2[i]);
            } else {
                System.out.print(box2[i] + ", ");
            }


        }

        for (int i = 0; i < box.length; i++) {
            if (box[i] % 2 != 0) box[i]++;
            System.out.print(box[i] + " ");



        }




    }
}
