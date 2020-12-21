package com.jrve.microservicios.app.controller;

import org.springframework.web.bind.annotation.RestController;

import com.jrve.microservicios.app.models.PedidosDetalleW;
import com.jrve.microservicios.app.models.repository.DetallePedidoRepository;
import com.jrve.microservicios.app.services.PedidoDetalleService;
import com.jrve.microservicios.commons.services.CommonServiceImp;

@RestController
public class PedidoDetalleController extends CommonServiceImp<PedidosDetalleW, DetallePedidoRepository> implements PedidoDetalleService {

}
