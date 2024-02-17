public class Complex {
    double re=0,im=0;
    Complex(double _re,double _im){
        re=_re;
        im=_im;
    }
    Complex add (Complex tmp){
        Complex res=new Complex(0, 0);
        res.re = re + tmp.re;
        res.im = im + tmp.im;
        return res;
    }
    Complex sub (Complex tmp){
        Complex res=new Complex(0, 0);
        res.re = re - tmp.re;
        res.im = im - tmp.im;
        return res;
    }
    Complex mul (Complex tmp){
        Complex res=new Complex(0, 0);
        res.re=re*tmp.re-im*tmp.im;
        res.im=re*tmp.im+im*tmp.re;
        return res;
    }
    Complex mul (double k){
        Complex res=new Complex(0, 0);
        res.re=re*k;
        res.im=im*k;
        return res;
    }
    Complex div (Complex tmp){
        Complex res=new Complex(0, 0);
        double d = tmp.re * tmp.re + tmp.im * tmp.im;
        res.re = ((re * tmp.re) - (im * -tmp.im)) / d;
        res.im = ((im * tmp.re) + (re * -tmp.im)) / d;
        return res;
    }
    public void algebr(){//вывод в алгебраическом виде 
        if (this.im>0&&this.re!=0){
            System.out.print(this.re+"+"+this.im+"i"+" ");
        }
        else if (this.im<0&&this.re!=0){
            System.out.print(this.re+""+this.im+"i"+" ");
        }
        else if (this.im==0){
            System.out.print(this.re+" ");
        }
        else if(this.re==0){
            System.out.print(this.im+"i"+" ");
        }
    }
    void out(){
        if(im>0){
            System.out.print(re+"+"+im+"i");
        }
        else if(im<0){
            System.out.print(re+"-"+(-im)+"i");
        }
        else{
            System.out.print(re);
        }
    }
}

