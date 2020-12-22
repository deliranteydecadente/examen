package com.jrve.microservicios.app.truper.services.imp;

import org.springframework.stereotype.Service;

import com.jrve.microservicios.app.truper.models.entity.PedidosW;
import com.jrve.microservicios.app.truper.models.repository.PedidoRepository;
import com.jrve.microservicios.app.truper.services.PedidosServices;
import com.jrve.microservicios.commons.services.CommonServiceImp;

@Service
public class PedidosServiceImp extends CommonServiceImp<PedidosW, PedidoRepository> implements PedidosServices{

}
