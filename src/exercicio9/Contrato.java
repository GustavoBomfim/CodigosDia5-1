package exercicio9;

import java.util.Date;


public class Contrato {
    private Integer numberContract;
    private Date dateContract;
    private Double contractValue;


    public Contrato(){

    }
    public Contrato(Integer numberContract, Date dateContract, Double contractValue) {
        this.numberContract = numberContract;
        this.dateContract = dateContract;
        this.contractValue = contractValue;

    }

    public Integer getNumberContract() {
        return numberContract;
    }


    public Date getDateContract() {
        return dateContract;
    }

    public void setDateContract(Date dateContract) {
        this.dateContract = dateContract;
    }

    public Double getContractValue() {
        return contractValue;
    }

    public void setContractValue(Double contractValue) {
        this.contractValue = contractValue;
    }




}
