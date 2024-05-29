<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:pay="http://www.servicios.co/pagos/schemas">
    <xsl:output method="xml" indent="yes"/>

    <xsl:template match="/">
        <html>
            <body>
                <h2>Referencia Factura</h2>
                <table border="1">
                    <tr bgcolor="#9acd32">
                        <th>Referencia</th>
                    </tr>
                    <tr>
                        <td><xsl:value-of select="pay:ReferenciaFactura/pay:referenciaFactura"/></td>
                    </tr>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
