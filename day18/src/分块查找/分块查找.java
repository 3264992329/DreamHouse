package 分块查找;

public class 分块查找 {
    public static void main(String[] args) {
        int[] arr={16,5,9,12,21,18,
                   32,23,37,26,45,34,
                    50,48,61,52,73,66};
        Block b1=new Block(21,0,5);
        Block b2=new Block(45,6,11);
        Block b3=new Block(73,12,15);

        Block[] blocks={b1,b2,b3};

        //查找30
        int a=getIndex(arr,blocks,66);
        System.out.println(a);
    }

    private static int getIndex(int[] arr, Block[] blocks, int i) {
        for (int j = 0; j < blocks.length; j++) {
            if(i<blocks[j].max){
                int b=getResult(arr,j,blocks[j]);
                return b;
            }
        }
        return -1;
    }

    private static int getResult(int[] arr, int j,Block block) {
        for (int i = block.start; i < block.end; i++) {
            if (arr[i]==66){
                return i;
            }
        }
        return -1;
    }


}
