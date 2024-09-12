        int[] bowler1 = {1,1,1,1,1,2,2,2,2,2,3,3,3,3,3,4,4,4,4,10};
        int[] bowler2 = {1,1,1,1,1,2,2,2,2,2,3,3,3,3,3,4,4,4,4,6};

        int frame = 1;
        for (int i = 0; i < bowler1.length-1; i+=2) {
            // i = 0, i = 2, i = 4, i = 6
            // this loop repeats 10 times... not 20
            // bowler 1 first frame scores are:
            System.out.println("Frame # " + frame + " scores are: ");
            System.out.println("First throw is: " + bowler1[i] + " second throw is: " + bowler1[i+1]);
            frame++;
        }
