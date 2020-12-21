package com.jrve.microservicios.app.controller;

import org.springframework.web.bind.annotation.RestController;

import com.jrve.microservicios.app.models.PedidosW;
import com.jrve.microservicios.app.services.PedidosSevice;
import com.jrve.microservicios.commons.controllers.CommonController;


@RestController
public class PedidosController extends CommonController<PedidosW,  PedidosSevice>{

}
