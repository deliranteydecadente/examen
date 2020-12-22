package com.jrve.microservicios.app.truper.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jrve.microservicios.app.truper.models.entity.PedidosDetalleW;
import com.jrve.microservicios.app.truper.services.PedidosDetalleServices;
import com.jrve.microservicios.commons.controllers.CommonController;

@RestController
@RequestMapping("/pedidosDetalle")
public class PedidoDetalleController extends CommonController<PedidosDetalleW, PedidosDetalleServices>{

}
