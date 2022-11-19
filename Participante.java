/*
 * @author Luis Cordón
 * @date 18-11-2022
 * Clase que contiene los atributos (getters y setters) de la información del participante. 
 */
public class Participante{
    //Personal
    private String nombre;
    //Social
    private boolean liderazgo;
    private boolean colaboracion;
    private boolean compañerismo;
    //Técnico
    private boolean experiencia;
    private boolean conocimiento;
    private boolean creatividad;
    //Administrativo
    private boolean barato;
    private boolean profesional;
    private boolean tiempoCompleto;

    public Participante() {
    }

    public Participante(String nombre, boolean liderazgo, boolean colaboracion, boolean compañerismo, 
    boolean experiencia, boolean conocimiento, boolean creatividad, boolean barato, boolean profesional, boolean tiempoCompleto) {
        this.nombre = nombre;
        this.liderazgo = liderazgo;
        this.colaboracion = colaboracion;
        this.compañerismo = compañerismo;
        this.experiencia = experiencia;
        this.conocimiento = conocimiento;
        this.creatividad = creatividad;
        this.barato = barato;
        this.profesional = profesional;
        this.tiempoCompleto = tiempoCompleto;
    }

    
    /** 
     * @return String
     */
    public String getNombre() {
        return this.nombre;
    }

    
    /** 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    /** 
     * @return boolean
     */
    public boolean isLiderazgo() {
        return this.liderazgo;
    }

    
    /** 
     * @return boolean
     */
    public boolean getLiderazgo() {
        return this.liderazgo;
    }

    
    /** 
     * @param liderazgo
     */
    public void setLiderazgo(boolean liderazgo) {
        this.liderazgo = liderazgo;
    }

    
    /** 
     * @return boolean
     */
    public boolean isColaboracion() {
        return this.colaboracion;
    }

    
    /** 
     * @return boolean
     */
    public boolean getColaboracion() {
        return this.colaboracion;
    }

    
    /** 
     * @param colaboracion
     */
    public void setColaboracion(boolean colaboracion) {
        this.colaboracion = colaboracion;
    }

    
    /** 
     * @return boolean
     */
    public boolean isCompañerismo() {
        return this.compañerismo;
    }

    
    /** 
     * @return boolean
     */
    public boolean getCompañerismo() {
        return this.compañerismo;
    }

    
    /** 
     * @param compañerismo
     */
    public void setCompañerismo(boolean compañerismo) {
        this.compañerismo = compañerismo;
    }

    
    /** 
     * @return boolean
     */
    public boolean isExperiencia() {
        return this.experiencia;
    }

    
    /** 
     * @return boolean
     */
    public boolean getExperiencia() {
        return this.experiencia;
    }

    
    /** 
     * @param experiencia
     */
    public void setExperiencia(boolean experiencia) {
        this.experiencia = experiencia;
    }

    
    /** 
     * @return boolean
     */
    public boolean isConocimiento() {
        return this.conocimiento;
    }

    
    /** 
     * @return boolean
     */
    public boolean getConocimiento() {
        return this.conocimiento;
    }

    
    /** 
     * @param conocimiento
     */
    public void setConocimiento(boolean conocimiento) {
        this.conocimiento = conocimiento;
    }

    
    /** 
     * @return boolean
     */
    public boolean isCreatividad() {
        return this.creatividad;
    }

    
    /** 
     * @return boolean
     */
    public boolean getCreatividad() {
        return this.creatividad;
    }

    
    /** 
     * @param creatividad
     */
    public void setCreatividad(boolean creatividad) {
        this.creatividad = creatividad;
    }

    
    /** 
     * @return boolean
     */
    public boolean isBarato() {
        return this.barato;
    }

    
    /** 
     * @return boolean
     */
    public boolean getBarato() {
        return this.barato;
    }

    
    /** 
     * @param barato
     */
    public void setBarato(boolean barato) {
        this.barato = barato;
    }

    
    /** 
     * @return boolean
     */
    public boolean isProfesional() {
        return this.profesional;
    }

    
    /** 
     * @return boolean
     */
    public boolean getProfesional() {
        return this.profesional;
    }

    
    /** 
     * @param profesional
     */
    public void setProfesional(boolean profesional) {
        this.profesional = profesional;
    }

    
    /** 
     * @return boolean
     */
    public boolean isTiempoCompleto() {
        return this.tiempoCompleto;
    }

    
    /** 
     * @return boolean
     */
    public boolean getTiempoCompleto() {
        return this.tiempoCompleto;
    }

    
    /** 
     * @param tiempoCompleto
     */
    public void setTiempoCompleto(boolean tiempoCompleto) {
        this.tiempoCompleto = tiempoCompleto;
    }    
    
    /** 
    * @return String
    */
    public String toString() {
        return "\n" +
            "nombre: " + getNombre() + 
            "\n";
    }
}