package com.company;

public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public void save() {
        System.out.println("Guardando empleado");
    }

    @Override
    public void findAll() {
        System.out.println("Buscando empleado");
    }

    @Override
    public void delete() {
        System.out.println("Eliminando empleado");
    }
}
