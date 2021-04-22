/*
 
 */
package githubb;

/**
 *
 * @author jjggs_000
 */
public class Formatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cabecera="\n\tPRONOSTICO DE CLIMA:\n";
        cabecera+="\n\tDia\t\tMañana\tNoche\tCondiciones\n";
        cabecera+="\t----\t\t-----\t------\t------\n";
        String pronostico="\tDomingo\t25C\t\t33C\t\tSoleado\n";
        pronostico+="\tLunes\t18C\t\t19C\t\tNublado\n;";
        pronostico+="\tMartes\t40C\t\t29C\t\tCaluroso\n;";        
        System.out.print(cabecera+pronostico);
        
    }
    
}
