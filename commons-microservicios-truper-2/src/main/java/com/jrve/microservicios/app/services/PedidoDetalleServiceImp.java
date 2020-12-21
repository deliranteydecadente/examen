package com.jrve.microservicios.app.services;

import org.springframework.stereotype.Service;

import com.jrve.microservicios.app.models.PedidosDetalleW;
import com.jrve.microservicios.app.models.repository.DetallePedidoRepository;
import com.jrve.microservicios.commons.services.CommonServiceImp;

@Service
public class PedidoDetalleServiceImp extends CommonServiceImp<PedidosDetalleW, DetallePedidoRepository> implements PedidoDetalleService {

}
