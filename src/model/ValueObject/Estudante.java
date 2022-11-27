package model.ValueObject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Estudante {
    private int idEstudante;
    private String nome;
    private String nome_do_item;
    private String contacto;
    private String status;
    private float valorPago;
    private String nivel;
    private String hora;
    private String data_inscriao;
    

public String getData_inscriao() {
        return data_inscriao;
    }


    public void setData_inscriao(String data_inscriao) {
        this.data_inscriao = data_inscriao;
    }


public Estudante(String nome,String contacto,float valorPago,String nivel,String hora, String nomeItem) {
    //this.idEstudante = idEstudante;
    this.nome = nome;
    this.contacto = contacto;
    this.valorPago = valorPago;
    this.nivel = nivel;
    this.hora = hora;
    this.nome_do_item = nomeItem;
    this.data_inscriao = getDateTime();
}


public  String getDateTime() {
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    Date date = new Date();
    return dateFormat.format(date);
}


    public String getHora() {
        return hora;
    }
    
    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getNome_Item() {
        return nome_do_item;
    }

    public void setNome_Item(String nome_Item) {
        this.nome_do_item = nome_Item;
    }

    

    private String nomeItem;


    public float getValorPago() {
        return valorPago;
    }

    public void setValorPago(float valorPago) {
        this.valorPago = valorPago;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public Estudante() {}

    public Estudante(String nome, String contacto, String status) {
        this.nome = nome;
        this.contacto = contacto;
        this.status = status;
    }


    public int getIdEstudante() {
        return idEstudante;
    }

    public void setIdEstudante(int idEstudante) {
        this.idEstudante = idEstudante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
