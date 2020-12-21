package com.jrve.microservicios.app.services;


import org.springframework.stereotype.Service;

import com.jrve.microservicios.app.models.PedidosW;
import com.jrve.microservicios.app.models.repository.PedidosRepository;
import com.jrve.microservicios.commons.services.CommonServiceImp;
@Service
public class PedidosServiceImp extends CommonServiceImp<PedidosW, PedidosRepository> implements PedidosSevice {

}
