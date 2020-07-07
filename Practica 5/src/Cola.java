import java.util.*;
import java.util.Scanner;


public class Cola 
{
private int Cima,Inicio,Final;
private int[]Numeros;
public Cola()
{
    Cima=0;
    Inicio=0;
    Final=0;
    Numeros=new int[Cima+1];
}
  
public Cola(int MAXI)
{
    Cima=100;
    Inicio=0;
    Final=0;
    Numeros=new int [Cima+1];
}
public void Agregar()
{
    if(ColaLLena())
    {
        System.out.println("\n Esta llena la cola");
    }
    else
    {
        int Datos;
        Scanner teclado=new Scanner(System.in);
        System.out.println("\n Cuantos datos quiere ingresar");
        Datos=teclado.nextInt();
        int E=1,T=100;
        int[]Num=new int[Datos];
        Random aleatorio=new Random();
        int a;
        for(int i=0;i<Num.length;i++)
        {
            do
            {
                a=aleatorio.nextInt(T-E+1)+E;
            }
            while(Contiene(Num,i,a));
            Num[i]=a;
            int X=a;
            if(X>101)
            {
                System.out.println("\n Verifica tus datos");
            }
            else
            {
                Final++;
                Numeros[Final]=X;
            }
        }
        
    }
}

public void Desplegar()
{
    if(ColaVacia())
    {
        System.out.println("\n Esta vacia");
    }
    else
    {
        String Desplegar="";
        for(int i=Inicio+1;i<=Final;i++)
        {
            Desplegar=Desplegar+Numeros[i]+"\n ";
        }
        System.out.println("\n Los numeros son: "+Desplegar);
    }
}


public void Eliminar()
{
    if(Inicio==Final)
    {
        System.out.println("\n Vacia");
    }
    else
    {
    for(int i=Inicio;i<Final-1;i++)
    {
        Numeros[i]=Numeros[i];
    }
    Final--;
    }
}

public void Vaciar()
{
    Inicio=0;
    Final=0;
}


public boolean ColaLLena()
{
    if(Final==Cima)
    {
        return true;
        
    }
    else
    {
        return false;
    }
}

public boolean ColaVacia()
{
    if(Inicio==Final)
    {
        return true;
    }
    else
    {
        return false;
    }
}
public static boolean Contiene(int[]numers,int in,int valor)
{
    for(int i=0;i<in;i++)
    {
        if(numers[i]==valor)
        {
            return true;
        }
    }
    return false;
}



public static Cola COLMENU;
    public static void main(String[] args) 
    {
      int Lim;
      Scanner teclado=new Scanner(System.in);
      System.out.println("\n De que tamaño es la cola");
      Lim=teclado.nextInt();
      COLMENU=new Cola(Lim);
      if(Lim>100||Lim<=0)
      {
          System.out.println("\n Verifique los datos");
      }
      else
      {
       int opcion;
       do
       {
            System.out.println(" 1.-Ingresa numeros");
            System.out.println(" 2.-Mostrar numeros");
            System.out.println(" 3.-Eliminar numeros");
            System.out.println(" 4.-Salir");
            System.out.println("\n");
            opcion=teclado.nextInt();
            switch(opcion)
            {
                case 1:
                {
                    COLMENU.Agregar();
                }
                break;
                case 2:
                {
                    COLMENU.Desplegar();
                }
                break;
                case 3:
                {
                    COLMENU.Vaciar();
                }
                break;
            }
       }
       while(opcion!=4);
      }
    }
    
   
    
    
    
    
    
    
    
    
    
}
