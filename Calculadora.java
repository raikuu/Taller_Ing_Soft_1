public class Calculadora{
     
	 public static void main(String[] args){
	      
		 if(args.length==3){
		    try{
			   int op1 = Integer.parseInt(args[1]);
			   int op2 = Integer.parseInt(args[2]);
			   
			   if("+".equals(args[0]))
			   System.out.println(op1 + op2);
			   else if("-".equals(args[0]))
			   System.out.println(op1 - op2);
			   else
			   System.out.println(args[0] + "Comando desconocido");
			   
			}catch(Exception ex){
               System.out.println("Wrong parameters");
            }
         }else {
            System.out.println("Use: Calcu operado operan1 operando2");
}
}
}			