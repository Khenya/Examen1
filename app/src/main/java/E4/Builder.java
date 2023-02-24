package E4;

public abstract class Builder {
    protected Contrato contrato;

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public abstract void showInfo();
    public abstract void setCosto();
    public abstract void setEmpresa();
    public abstract void listaCanales();
    
    
}
