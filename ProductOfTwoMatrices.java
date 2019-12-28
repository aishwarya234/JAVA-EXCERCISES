
public class ProductOfTwoMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]x=new int[3][3];
		int [][]y=new int[3][3];
		int [] []z=new int[3][3];
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				x[i][j]=i+j;
		
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				y[i][j]=i*j;
		
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				for(int k=0;k<3;k++)
				z[i][j]+=x[i][k]*y[k][j];
			
		
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(z[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
