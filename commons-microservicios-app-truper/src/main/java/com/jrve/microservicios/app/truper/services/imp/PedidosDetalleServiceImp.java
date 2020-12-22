package com.jrve.microservicios.app.truper.services.imp;

import org.springframework.stereotype.Service;

import com.jrve.microservicios.app.truper.models.entity.PedidosDetalleW;
import com.jrve.microservicios.app.truper.models.repository.PedidoDetalleRepository;
import com.jrve.microservicios.app.truper.services.PedidosDetalleServices;
import com.jrve.microservicios.commons.services.CommonServiceImp;

@Service
public class PedidosDetalleServiceImp extends CommonServiceImp<PedidosDetalleW, PedidoDetalleRepository> implements PedidosDetalleServices{

}
