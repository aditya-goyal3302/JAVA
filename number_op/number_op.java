package number_op;
import java.util.Scanner;
class array_func{
    public 
    static int amstrong(int num){
        int n=num , temp=0,ans=0, power = 0;
        while(n!=0){
            n /=10;
            power++;
        }
        n = num;
        while(n!=0){
            temp = n%10;
            ans += Math.pow(temp,power);
            n /=10;
        }
        if(ans == num)
            return 1;
        return 0;
    } ;
    static void display(int arr[] , int s){
        for(int i = 0; i<s; i++) 
            System.out.print(arr[i]+" ");
        System.out.println();
    };
    static void deletion(int arr[] , int s) {
		System.out.println("\n\nMULTIPLE OF NUMBER: ");
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose multiples are to be deleted:");
        int multiple = sc.nextInt();
        for(int i = 0 ; i <s;i++) 
            if(arr[i]%multiple==0)
                arr[i]=0;
	};
    static int mid(int arr[] , int s) {
		System.out.println("\n\nLARGEST AND SMALLEST AT MIDDLE: ");
		int max, min = max = arr[0];
		for(int i=0;i<s;i++) {
			if(arr[i]>max) 
				max = arr[i];
			if(arr[i]<min) 
				min = arr[i];
		}
		int sum = min + max;
		System.out.println("The smallest number is: "+min);
		System.out.println("The largest number is: "+max);
		System.out.println("Sum of largest and smallest number is:" + sum);	
		System.out.println("Array after inserting sum in middle:");
		int middle;
        middle = s/2 ;
		for(int i = s-1; i > middle-1;i--) 
			arr[i+1] = arr[i];
		arr[middle] = sum;
        return s+1;
	};
	static void reverse(int arr[] , int s) {
		System.out.println("\n\nREVERSED ARRAY: ");
		int start = 0,temp,end = s-1;
		while(start<end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
		}
	};
};
class matrix{
    int arr[][],row,col;
    public
    matrix(){
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the Size of Matrix you want (L & B): ");
        row = sn.nextInt();
        col = sn.nextInt();
        arr = new int[row][col];
        System.out.println("Enter data in Matrix: ");
        for(int i =0 ; i<row ; i++)
            for(int j=0;j<col;j++)    
                arr[i][j] = sn.nextInt();
    };
    matrix(matrix ob){
		this.row=ob.row;
		this.col=ob.col;
        arr = new int[row][col];
		for(int i=0;i<ob.row;i++)
			for(int j=0;j<ob.col;j++)
				this.arr[i][j] = ob.arr[i][j];
	}
    void transpose(){
		System.out.println("\nTranspose of Matrix: ");
		matrix temp= new matrix(this);
		int r,c;
		int t=row;
		row=col;
		col=t;
		r=(row>temp.row)?row:temp.row;
		c=(col>temp.col)?col:temp.col;
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				if(i!=j){
					int tp=temp.arr[j][i];
					temp.arr[j][i]=arr[i][j];
					arr[i][j]=tp;
				}
        this.display();
	}
    void add(matrix ob1, matrix ob2){
		System.out.println("\nAddition of Matrix: ");
		if(ob1.row==ob2.row && ob1.col==ob2.col){
			row=ob1.row;
			col=ob1.col;
			for(int i=0;i<row;i++)
				for(int j=0;j<col;j++)
					arr[i][j]=ob1.arr[i][j]+ob2.arr[i][j];
		}
        this.display();
	}
	void multiply(matrix ob1,matrix ob2){
		System.out.println("\nMultiplication of Matrix: ");
		if(ob1.col==ob2.row){
			row=ob1.row;
			col=ob2.col;
			for(int i=0;i<row;i++)
				for(int j=0;j<col;j++)
					arr[i][j]=0;
			for(int i=0;i<row;i++)
				for(int j=0;j<col;j++)
					for(int k=0;k<col;k++)
						arr[i][j]=arr[i][j]+(ob1.arr[i][k]*ob2.arr[k][j]);
		}
        this.display();
	}
	void display(){
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++)
				System.out.print(arr[i][j]+" ");
			System.out.print("\n");
		}
	}
};
public class number_op{
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int op = 0 ;
        while(true){
            System.out.println("1-> Array Functions \n2-> Matrix Functions \nEnter operation no.: ");
            op = sn.nextInt();

            if(op == 1)
                number_op.array_1d();
            else if(op == 2)
                number_op.array_2d();
        }
    };
    static void array_1d(){
        Scanner sn = new Scanner(System.in);
        int size = 0 ,op = 0;
        System.out.println("Enter the Size of Array you want: ");
        size = sn.nextInt();
        int arr[] = new int[size+1];
        System.out.println("Enter data in Array: ");
        for(int i =0 ; i<size ; i++)    
            arr[i] = sn.nextInt();
        while(true){
            System.out.println("1 -> Clean Amstrong Numbers \n2 -> Delete all multiple of a number \n3 -> Sum of largest and smallest in middle \n4 -> Reverse Array \nEnter operation for your 1d Array: ");
            op = sn.nextInt();
            if(op == 1){
                for(int i =0; i<size; i++)
                    if(array_func.amstrong(arr[i]) == 1)
                        arr[i] = i;
                array_func.display(arr, size);
            }
            else if(op == 2){
                array_func.deletion(arr, size);
                array_func.display(arr, size);
            }else if(op == 3){
                size = array_func.mid(arr, size);
                array_func.display(arr, size);
            }else if(op == 4){
                array_func.reverse(arr, size);
                array_func.display(arr, size);
            }
            else if(op == 5)  break;
        }
    };
    static void array_2d(){
        Scanner sn = new Scanner(System.in);
        int op=0; 
        matrix ob1 = new matrix();
        while(true){
            System.out.println("1 -> Addition And Multiplication of Matrix \n2 -> Transpose of Matrix \nEnter operation for your 2d Array: ");
            op = sn.nextInt();
            if(op == 1){
                matrix ob2 = new matrix();
                matrix ob3 = new matrix(ob2);
                ob3.add(ob1, ob2);
                ob3.multiply(ob1, ob2);
            }
            if(op == 2){
                ob1.transpose();
            }
		}
    };
};