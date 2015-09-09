<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html xmlns:ng="http://angularjs.org" lang="pt">

    <md-toolbar class="md-tall md-toolbar-main" layout="row" layout-align="center center">
         <eits-search-tags width="100%" placeholder="Digite sua pesquisa" change-tag="changeTags" tags="tags" tags-string="model.tagsString"></eits-search-tags>
         <md-button class="md-fab md-accent md-hue-2 grid-add-button" aria-label="Adicionar" ng-click="abrirPopupNovaEntidade($event)">
            <i class="md-icon md-icon-add md-icon-lg"></i>
          </md-button>
    </md-toolbar>

    <!--<eits-table id="table" content="currentPage.content" multi-selection="true" on-selection-change="selectionUpdate(selectedItens)" on-item-click="itemClicked(item)">-->
         <!--<columns>-->
            <!--<table-column header="Valor" field="valor" sortable="true" width="10%"/>-->
            <!--<table-column header="Urgência" field="urgencia" width="30%"/>-->
            <!--<table-column header="Gravidade" field="gravidade" width="30%"/>-->
            <!--<table-column header="Tendência" field="tendencia" width="30%"/>-->
        <!--</columns>-->
    <!--</eits-table>-->

    <md-data-table-container>
        <table md-data-table md-row-select="model.selected">
            <thead md-order="model.query.order" md-trim-column-names>
            <tr>
                <th order-by="valor">Valor</th>
                <th order-by="urgencia">Urgência</th>
                <th order-by="gravidade">Gravidade</th>
                <th order-by="tendencia">Tendência</th>
            </tr>
            </thead>
            <tbody>
            <tr ng-repeat="criterio in currentPage.content | orderBy: model.query.order" ng-click="itemClicked($event, criterio)" md-auto-select>
                <td>{{::criterio.valor}}</td>
                <td>{{::criterio.urgencia}}</td>
                <td>{{::criterio.gravidade}}</td>
                <td>{{::criterio.tendencia}}</td>
            </tr>
            </tbody>
        </table>
    </md-data-table-container>

    <bottomsheet>
         <div class="bottom-sheet-content">
             <div class="left-content" layout="row">
                 <div>{{model.itensExcluir.length}} {{model.itensExcluir.length > 1 ? 'itens' : 'item'}} selecionado{{model.itensExcluir.length > 1 ? 's' : ''}}</div>
                 <div class="limpar-selecao" ng-click="limparSelecao()">Limpar seleção</div>
             </div>
            <div class="right-content">
                 <md-button class="md-raised" aria-label="Excluir" ng-click="excluirCriterioPriorizacao($event, model.itensExcluir)"><i class="md-icon-delete md-icon-lg"></i></md-button>
              </div>
          </div>
    </bottomsheet>

</html>