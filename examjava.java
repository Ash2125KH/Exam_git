class examjava
public static void main (String args[])
{

    int n1 = 0; 
    int n2 = 1; 
    int n3;
    int count = 20;

    system.out.println(n1+" "+n2);

    for(i=2; i<count; ++i)
    {
        n3 = n1+n2;
        system.out.println(" "+n3);
        n1 = n2;
        n2 = n3;

    }

}