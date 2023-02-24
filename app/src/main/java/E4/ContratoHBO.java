package E4;

public class ContratoHBO extends Builder{

    @Override
    public void listaCanales() {
        // this.contrato.setListaCanales(new );
        
    }

    @Override
    public void setCosto() {
        this.contrato.setCosto("100 bs");
        
    }

    @Override
    public void setEmpresa() {
        this.contrato.setEmpresa("hbo");
        
    }

    @Override
    public void showInfo() {
        this.contrato.showInfo();
        
    }
    
}
