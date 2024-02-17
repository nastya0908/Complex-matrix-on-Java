import java.util.Scanner;

public class ComplexMtr {
    int n,m;
    Complex[][] mtr;
    Scanner scanner=new Scanner(System.in);
    ComplexMtr(int _n,int _m){//n-string,m-column
        n=_n;
        m=_m;
        mtr=new Complex[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mtr[i][j]=new Complex(0, 0);
            }
        }
    }

    void setCom(int i,int j,Complex a){
        mtr[i][j]=a;
    }

    void fillMtr(){//заполнение матрицы
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println(i+"-ая строка "+j+"-ый столбец:");
                double a1=scanner.nextDouble();
                double a2=scanner.nextDouble();
                Complex q=new Complex(a1, a2);
                setCom(i, j, q);
            }
        }
    }

    void add(ComplexMtr tmp){//сложение матриц
        if (this.n!=tmp.n || this.m!=tmp.m){
            System.out.println("Матрицы разного размера, сложение невозможно");
        }
        else{
            ComplexMtr res =new ComplexMtr(n, m);
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                res.mtr[i][j]=mtr[i][j].add(tmp.mtr[i][j]);
                res.mtr[i][j].algebr();
                }
                System.out.println();
            }
        }
    }

    void sub(ComplexMtr tmp){//вычитание матриц
        if (this.n!=tmp.n || this.m!=tmp.m){
            System.out.println("Матрицы разного размера, вычитание невозможно");
        }
        else{
            ComplexMtr res =new ComplexMtr(n, m);
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    res.mtr[i][j]=mtr[i][j].sub(tmp.mtr[i][j]);
                    res.mtr[i][j].algebr();
                }
                System.out.println();
            } 
        }
    }

    void mul(ComplexMtr tmp){ //умножение матриц
        ComplexMtr res =new ComplexMtr(this.n, tmp.m);
        Complex l = new Complex(0, 0);
        if (this.n!=tmp.m){
            System.out.println("Матрицы неподходящего размера, умножение невозможно");
        }
        else{
			for (int i = 0; i < this.n; i++){
				for (int j = 0; j < tmp.m; j++){
                    res.setCom(i, j, l);
                    for (int k = 0; k < this.n; k++){
						res.mtr[i][j] = res.mtr[i][j].add(this.mtr[i][k].mul(tmp.mtr[k][j]));
					}
                    res.mtr[i][j].algebr();
				}
                System.out.println();
			}
		    
        }
    }
    ComplexMtr mul(double k){ //умножение матрицы на константу
        ComplexMtr res =new ComplexMtr(n, m);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res.mtr[i][j]=mtr[i][j].mul(k);
            }
        }
        return res;
    }
    public void transp(){ //транспонирование матрицы
        ComplexMtr res=new ComplexMtr(m,n);
        for (int i=0;i<this.m;i++){
            for (int j=0 ;j<this.n;j++){
                res.mtr[i][j] = this.mtr[j][i];
                res.mtr[i][j].algebr();
        }
        System.out.println();
        }   
    }
    void printMtr(){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mtr[i][j].algebr();
                System.out.print("  ");
            }
            System.out.println("");
        }
    }
}
