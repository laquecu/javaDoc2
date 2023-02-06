/**
 * Clase para manejar las entradas de un blog
 * @author Jorge Selva
 * @version 2.3
 * @since 5/2/2023
 */
public class EntradaBlogJsc{

    /**
     * hacemos esta variable del separador estática.
     */
    public static char separador=':'; //separa ENTRADA DE del nombre del autor
    private int id;
    private String texto;
    private String autor;

    /** Constructor de la clase. recibe el número de entrada, el nombre del autor
     * de la entrada y el texto que contiene la entrada. Si el número de entrada
     * es negativo, lanza una excepción.
     * @param id : numero de la entrada
     * @param autor : nombre del autor de la entrada
     * @param texto :texto incluido en la entrada
     * @throws IllegalArgumentException
     */
    public EntradaBlogJsc(int id,String autor,String texto)throws IllegalArgumentException{
        if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
        this.id=id;
        this.autor=autor;
        this.texto=texto;
    }
    @Override
    public String toString(){
        String cad="\nNum.Entrada"+separador+id;
        cad+="\nENTRADA DE"+separador+autor;
        cad+="\n "+texto;
        return cad;
    }

    /**
     * @return el numero de la entrada
     */
    public int getId(){
        return this.id;
    }

    /**
     * @return el texto completo de la entrada
     */
    public String getTexto(){
        return this.texto;
    }

    /**
     * @return el nombre del autor
     */
    public String getAutor(){
        return this.autor.toUpperCase();
    }

    /**
     * comment out

     public String devuelveAutor(){
     return this.autor;
     }
     */


    /**
     * no tiene porqué tener argumentos.
     * @param args
     */

    public static void main(String[] args) {
        EntradaBlogJsc e1=new EntradaBlogJsc (3, "Ana", "Últimas noticias, está disponible BixBy 2.0");
        System.out.println(e1.toString());
    }

}
