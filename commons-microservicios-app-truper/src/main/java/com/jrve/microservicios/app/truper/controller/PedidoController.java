package com.jrve.microservicios.app.truper.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jrve.microservicios.app.truper.models.entity.PedidosW;
import com.jrve.microservicios.app.truper.services.PedidosServices;
import com.jrve.microservicios.commons.controllers.CommonController;

@RestController
@RequestMapping("/pedidos")
public class PedidoController extends CommonController<PedidosW, PedidosServices>{

}
