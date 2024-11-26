package com.emssanar.store.service;

import com.emssanar.store.model.Cliente;
import com.emssanar.store.repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    private IClienteRepository iClienteRepository;

    @Autowired
    public ClienteService(IClienteRepository icr) {
        this.iClienteRepository = icr;
    }

    public List<Cliente> listarcliente() {
        return iClienteRepository.findAll();
    }

    public Cliente guardarcliente(Cliente cs){
        return iClienteRepository.save(cs);
    }

    public Cliente obtenerClientePorId(Long id) {
        return iClienteRepository.findById(id).orElse(null);
    }

    public Cliente crearCliente(Cliente cliente) {
        return iClienteRepository.save(cliente);
    }

    public Cliente actualizarCliente(Cliente cliente) {
        return iClienteRepository.save(cliente);
    }

    public void eliminarCliente(Long id) {
        iClienteRepository.deleteById(id);
    }
}
