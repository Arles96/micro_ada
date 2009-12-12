package CodeGeneration;
import AdaSemantic.*;
import java.util.ArrayList;
import java.util.Stack;
/**
La súper clase de generación de código.
Genera código final para MIPS
@author Luis Felipe Borjas
@date	11 dic 2009; 2353 hrs

Su entrada consiste en el código intermedio y la tabla de símbolos aplanada que le pasa el 
front-end. Antes de generar el código, particiona éste en bloques básicos y genera 
la información de siguiente uso.
*/

public class Backend{
	/*Lo que le pasa el backend*/
	public ArrayList<Cuadruplo> icode;
	public FlatSymbolTable st;
	
	/**Para debugear:*/
	public boolean DEBUG;
	/*Lo que ocupa internamente*/
	private ArrayList<BasicBlock> basicBlocks;
	private final static String DECLARERS="function|glbl";
	private final static String BBDELIMITERS="initFunction|initRecord|if.*|goto";
	private final static String BEGINNERS="initFunction";
	/*TODO: AQUI FIJO VAN MÁS COSAS*/

	/**El constructor, recibe del front-end las cosas y del main si debuggear*/
	public Backend(ArrayList<Cuadruplo> i, FlatSymbolTable t, boolean dbg){
		icode=i;
		st=t;
		DEBUG=dbg;
		this.icode=reorderCode(this.icode);
		findBasicBlocks(this.icode);
	}

	/**El método que mueve todo el código de la parte declarativa de un subprograma 
	   al cuerpo. ¡Importante para poder generar los bloques básicos!*/	
	private ArrayList<Cuadruplo> reorderCode(ArrayList<Cuadruplo> code){
		ArrayList<Cuadruplo> reordered=new ArrayList<Cuadruplo>	();
		//cada vez que encuentre un function, poner la parte declarativa acá
		Stack<ArrayList<Cuadruplo>> declarativePart=new Stack<ArrayList<Cuadruplo>>();
		//acordate de saltarte los records!
		boolean stackMe=false;		
		ArrayList<Cuadruplo> toStack=new ArrayList<Cuadruplo>();

		for(Cuadruplo instruction: code){
			//si es un declarador, meter todo en el stack
			
			if(instruction.operador.matches(DECLARERS)){
				stackMe=true;
				reordered.add(instruction);
				continue;
			}else if(instruction.operador.matches(BEGINNERS)){
				stackMe=false;
				reordered.add(instruction);
				if(declarativePart.peek() != null)
					reordered.addAll(declarative.pop());
				continue;
			}
	
			if(stackMe){
				
			}
				
		}
	}

	/**El método que determina los bloques básicos*/
	private void findBasicBlocks(ArrayList<Cuadruplo> code){
		for(Cuadruplo instruction : code){
		/**TODO*/
		}
		
		
		if(DEBUG){
			for(BasicBlock b: this.basicBlocks)
				System.out.println(b);
		}
	}
}
