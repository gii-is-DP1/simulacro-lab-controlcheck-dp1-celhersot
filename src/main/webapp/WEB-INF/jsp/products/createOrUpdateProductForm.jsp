<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>

<petclinic:layout pageName="products">
    <jsp:body>
        <h2>
            <c:if test="${product['new']}">New </c:if> Product
        </h2>
        <form:form modelAttribute="product" class="form-horizontal">
            <input type="hidden" name="id" value="${producr.id}"/>
            <div class="form-group has-feedback">
            
                <div class="form-group">
                    <label class="col-sm-2 control-label">Product name</label>
                    <div class="col-sm-10">
                        <c:out value="${product.name}"/>
                    </div>
                </div>
                <petclinic:inputField label="Name" name="name"/>
                
                <div class="control-group">
                    <petclinic:selectField name="type" label="Type " names="${types}" size="5"/>
                </div>
                
                                <div class="form-group">
                    <label class="col-sm-2 control-label">Product price</label>
                    <div class="col-sm-10">
                        <c:out value="${product.price}"/>
                    </div>
                </div>
                <petclinic:inputField label="Price" name="price"/>
                <div class="control-group">
                    <petclinic:selectField name="type" label="Type " names="${types}" size="5"/>
                </div>
                
                                <div class="form-group">
                    <label class="col-sm-2 control-label">Product type</label>
                    <div class="col-sm-10">
                        <c:out value="${product.type}"/>
                    </div>
                </div>
                <petclinic:inputField label="ProductType" name="productType"/>
                <div class="control-group">
                    <petclinic:selectField name="type" label="Type " names="${types}" size="5"/>
                </div>
                
            </div>
            
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <c:choose>
                        <c:when test="${product['new']}">
                            <button class="btn btn-default" type="submit">Add Product</button>
                        </c:when>
                        <c:otherwise>
                            <button class="btn btn-default" type="submit">Update Product</button>
                        </c:otherwise>
                    </c:choose>
                </div>
            </div>
        </form:form>
        <c:if test="${!product['new']}">
        </c:if>
    </jsp:body>
</petclinic:layout>
