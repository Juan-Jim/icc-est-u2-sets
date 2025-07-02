package controllers;

import java.util.Set;
import java.util.TreeSet;
import models.Contacto;
import utils.ContactoComparate;
import utils.ContactoComparateHash;
import utils.ContactoComparateTelefono;

public class ContactoControler {
    private Set<Contacto> agendaOrdenadaNombre;
    private Set<Contacto> agendaOrdenadaTelefono;
    private Set<Contacto> agendaPorHash;    
    

    public ContactoControler() {
        agendaOrdenadaNombre = new TreeSet<>(new ContactoComparate());
        agendaOrdenadaTelefono = new TreeSet<>(new ContactoComparateTelefono());
        agendaPorHash = new TreeSet<Contacto>(new ContactoComparateHash());
        cargarContactos();
    }


    private void cargarContactos() {
        agregar(new Contacto("Pedro", "Lopez", "222222222"));
        agregar(new Contacto("Luis", "Perez", "111111111"));
        agregar(new Contacto("Pedro", "Gonzales", "123456789"));
        agregar(new Contacto("Ana", "Perez", "987654321"));
        agregar(new Contacto("Pedro", "Lopez", "123456789"));
        agregar(new Contacto("Pedro", "Gonzales", "222222222"));
        agregar(new Contacto("Pablo", "Lopez", "222222222"));
    }

    private void agregar(Contacto c) {
        agendaOrdenadaNombre.add(c);
        agendaOrdenadaTelefono.add(c);
        agendaPorHash.add(c);
    }

    public Set<Contacto> getAgendaNombre() {
        return agendaOrdenadaNombre;
    }

    public Set<Contacto> getAgendaTelefono() {
        return agendaOrdenadaTelefono;
    }

    public Set<Contacto> getAgendaPorHash() {
        return agendaPorHash;
    }
}

