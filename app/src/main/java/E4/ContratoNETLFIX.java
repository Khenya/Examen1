package E4;

public class ContratoNETLFIX extends Builder{

    @Override
    public void listaCanales() {
        // this.contrato.setListaCanales(new );
        
    }

    @Override
    public void setCosto() {
        this.contrato.setCosto("150 bs");
        
    }

    @Override
    public void setEmpresa() {
        this.contrato.setEmpresa("netflix");
        
    }

    @Override
    public void showInfo() {
        this.contrato.showInfo();
        
    }
    
}
