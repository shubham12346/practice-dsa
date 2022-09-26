// 3. [Spiral Matrix III](https://leetcode.com/problems/spiral-matrix-iii/)
class ques3{
    public static void main(String[] args) {
        int row=1,col=4,rStart=0,cStart=0;
        int ans[][] = spiralMatrix(row, col, rStart, cStart) ; 
        for (int[] arr : ans) {
            for ( int i  : arr) {
                System.out.print(i+" ");
                
            }
            System.out.println(" ");
            
        }      
    }
    public static int[][] spiralMatrix(int row,int col,int rStart,int cStart){
        int direction [] ={0,1,0,-1,0};
        int len =0;
        int d=0;
        int mat [][] = new int [row * col][2];
        int i=0;
        
       mat[i++] = new int[]{rStart,cStart};

       while(i < row*col){
        if(d==0|| d==2){
            len++;

        }
        for(int k=0;k<len;k++){
            rStart+= direction[d];
            cStart+= direction[d+1];

            if(cStart>=0 && cStart < col && rStart>=0 && rStart < row){
                mat[i++] = new int[]{rStart,cStart};
            }
        }
        d= ++d%4;
       }
       return mat;
        

    }
}