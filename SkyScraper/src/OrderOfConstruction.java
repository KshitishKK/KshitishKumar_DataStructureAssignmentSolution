import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class OrderOfConstruction extends Driver {
        protected void ordering(int sizearray[])
        {
            Stack s= new Stack();
            int temp[] = new int[sizearray.length];
            for(int i=0;i<sizearray.length;i++)
            {
                temp[i]=sizearray[i];
            }
            Arrays.sort(temp);
            ArrayList temp2=new ArrayList();
            System.out.println("The order of construction is as follows\n");
            int j = temp.length-1,max=-1,day=1;
            for(int i=0;i<sizearray.length;i++)
            {
                System.out.println("Day: " + day++);

                if(sizearray[i]== temp[j])
                {
                    System.out.print(sizearray[i] + " ");
                   for(int k=i-1,m=j-1;k>max;k--)
                   {
                       if(temp2.contains(temp[m]))
                       {
                           System.out.print(temp2.remove(k) + " ");
                           m--;
                       }

                   j=m;
                   }
                    System.out.print("\n");
                   max=i;
                   // j--;
                }
                else
                {
                    temp2.add(sizearray[i]);
                }

            }
          for(int len= temp2.size()-1;len>=0;len--)
            System.out.print(temp2.get(len) + " ");











            /*
            int temp[]= new int[sizearray.length];
                int max=0,k=1;
                int location = 0;

            for(int i=0,j=1;i<sizearray.length;i++)
            {
                System.out.println("Day: " + k++);

                if(sizearray[i]>sizearray[j])
                {
                    System.out.println(sizearray[i]);
                    max = sizearray[i];
                    location = i;
                    j++;
                }
                else if(sizearray[i]==sizearray[j])
                {
                    for(int l=j;l>=location;l--){
                    System.out.println(sizearray[l]);}
                    location=j;
                    j=j+i+1;
                }

            }


                ///////////////////////////////////////////
                for(int i=1;i<=sizearray.length;i++)


                {
                      if(sizearray[i]>max)
                      {
                              max= sizearray[i];
                              location=i;
                      }
                }

                 //////////////////////////////////////////


            for(int i=0;i<sizearray.length;i++)
            {
                temp[i]=sizearray[i];
            }
            Arrays.sort(temp);
                System.out.println("The order of construction is as follows\n");
                int j=1,m=0;
            for(int i=0;i<sizearray.length;i++) {
                System.out.println("Day: " + k++);
               // location=i;
                if(sizearray[i]==temp[temp.length-j] )
                {
                    for(int l=j;l>=location;l--) {
                        System.out.println(sizearray[l+m]);
                    }
                    m++;
                    location=j+1;
                    j=j+i+1;
                }/*
                else if(temp[temp.length-1]==sizearray[j])
                {
                    System.out.println(sizearray[i]);
                    System.out.println(sizearray[i-1]);

                }
                */

            }
            //System.out.println(sizearray[j]);


            }

