/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Hakim
 */
public class Aside {
 
    public static String aside(){
    return" <aside id=\"sidebar\" class=\"sidebar\">\n" +
"      \n" +
"    <ul class=\"sidebar-nav\" id=\"sidebar-nav\">  \n" +
"      <li class=\"nav-item\">\n" +
"        <a class=\"nav-link collapsed\" data-bs-target=\"#components-nav\" data-bs-toggle=\"collapse\" href=\"#\">\n" +
"          <i class=\"bi bi-menu-button-wide\"></i><span>Ajout</span><i class=\"bi bi-chevron-down ms-auto\"></i>\n" +
"        </a>\n" +
"        <ul id=\"components-nav\" class=\"nav-content collapse \" data-bs-parent=\"#sidebar-nav\">\n" +
"                  <li class=\"nav-item\">\n" +
"                  <a  href=\"Embauche.jsp\">\n" +
"                    <i class=\"bi bi-circle\"></i>\n" +
"                    <span>Embauche</span>\n" +
"                  </a>\n" +
"                </li>\n" +
"                <li class=\"nav-item\">\n" +
"                  <a  href=\"page-ajout-genre.jsp\">\n" +
"                    <i class=\"bi bi-circle\"></i>\n" +
"                    <span>Ajout genre</span>\n" +
"                  </a>\n" +
"                </li>\n" +
"                <li class=\"nav-item\">\n" +
"                  <a  href=\"page-ajout-client.jsp\">\n" +
"                    <i class=\"bi bi-circle\"></i>\n" +
"                    <span>Ajout client</span>\n" +
"                  </a>\n" +
"                </li>\n" +
"                <li class=\"nav-item\">\n" +
"                  <a  href=\"page-ajout-vente.jsp\">\n" +
"                    <i class=\"bi bi-circle\"></i>\n" +
"                    <span>Ajout vente</span>\n" +
"                  </a>\n" +
"                </li>\n" +
"                <li class=\"nav-item\">\n" +
"                  <a  href=\"page-ajout-poketra.jsp\">\n" +
"                    <i class=\"bi bi-circle\"></i>\n" +
"                    <span>Ajout poketra</span>\n" +
"                  </a>\n" +
"                </li><!-- add poketra link -->\n" +
"                       <li class=\"nav-item\">\n" +
"                        <a  href=\"Fabrication.jsp\">\n" +
"                          <i class=\"bi bi-circle\"></i>\n" +
"                          <span>Fabrications</span>\n" +
"                        </a>\n" +
"                      </li><!-- front office -->\n" +
"\n" +
"                    <li class=\"nav-item\">\n" +
"                    <a href=\"Employer.jsp\">\n" +
"                      <i class=\"bi bi-circle\"></i>\n" +
"                      <span>Ajout Employer</span>\n" +
"                    </a>\n" +
"                  </li><!-- front office -->\n" +
"\n" +
"                    <li class=\"nav-item\">\n" +
"                      <a  href=\"page_ajout_commande.jsp\">\n" +
"                        <i class=\"bi bi-circle\"></i>\n" +
"                        <span>Ajout Commande</span>\n" +
"                      </a>\n" +
"                    </li><!-- front office -->\n" +
"\n" +
"                    <li class=\"nav-item\">\n" +
"                      <a  href=\"page_ajout_stock.jsp\">\n" +
"                        <i class=\"bi bi-circle\"></i>\n" +
"                        <span>Ajout Stock</span>\n" +
"                      </a>\n" +
"                    </li><!-- front office -->\n" +
"                    \n" +
"                    <li class=\"nav-item\">\n" +
"                      <a href=\"page-ajout-look.jsp\">\n" +
"                        <i class=\"bi bi-circle\"></i>\n" +
"                        <span>Ajouter Look</span>\n" +
"                      </a>\n" +
"                    </li><!-- front office -->\n" +
"\n" +
"                    <li class=\"nav-item\">\n" +
"                      <a  href=\"page-ajout-type.jsp\">\n" +
"                        <i class=\"bi bi-circle\"></i>\n" +
"                        <span>Ajouter type</span>\n" +
"                      </a>\n" +
"                    </li><!-- front office -->\n" +
"                        \n" +
"                    <li class=\"nav-item\">\n" +
"                      <a  href=\"page-ajout-matierePrem.jsp\">\n" +
"                        <i class=\"bi bi-circle\"></i>\n" +
"                        <span>Ajouter matiere premiere</span>\n" +
"                      </a>\n" +
"                    </li><!-- front office -->\n" +
"                      <li class=\"nav-item\">\n" +
"                      <a  href=\"page-ajout-taille.jsp\">\n" +
"                        <i class=\"bi bi-circle\"></i>\n" +
"                        <span>Ajouter Taille</span>\n" +
"                      </a>\n" +
"                    </li><!-- front office -->\n" +
"        </ul>\n" +
"      </li><!-- End Components Nav1 -->\n" +
"            <li class=\"nav-item\">\n" +
"        <a class=\"nav-link collapsed\" data-bs-target=\"#forms-nav\" data-bs-toggle=\"collapse\" href=\"#\">\n" +
"          <i class=\"bi bi-journal-text\"></i><span>Listes</span><i class=\"bi bi-chevron-down ms-auto\"></i>\n" +
"        </a>\n" +
"        <ul id=\"forms-nav\" class=\"nav-content collapse \" data-bs-parent=\"#sidebar-nav\">\n" +
"                             <li >\n" +
"                              <a  href=\"ListEmp\">\n" +
"                                <i class=\"bi bi-circle\"></i>\n" +
"                                <span>Liste Emp</span>\n" +
"                              </a>\n" +
"                            </li><!-- front office -->\n" +
"                            <li >\n" +
"                              <a  href=\"page-list-look.jsp\">\n" +
"                                <i class=\"bi bi-circle\"></i>\n" +
"                                <span>Liste Look</span>\n" +
"                              </a>\n" +
"                            </li><!-- front office -->\n" +
"\n" +
"\n" +
"                            <li>\n" +
"                              <a href=\"page-list-matierePrem.jsp\">\n" +
"                                <i class=\"bi bi-circle\"></i>\n" +
"                                <span>Liste matiere premiere</span>\n" +
"                              </a>\n" +
"                            </li><!-- front office -->\n" +
"        </ul>\n" +
"      </li><!-- End Forms Nav -->\n" +
"      <li class=\"nav-item\">\n" +
"        <a class=\"nav-link collapsed\" data-bs-target=\"#tables-nav\" data-bs-toggle=\"collapse\" href=\"#\">\n" +
"          <i class=\"bi bi-layout-text-window-reverse\"></i><span>Recherce</span><i class=\"bi bi-chevron-down ms-auto\"></i>\n" +
"        </a>\n" +
"        <ul id=\"tables-nav\" class=\"nav-content collapse \" data-bs-parent=\"#sidebar-nav\">\n" +
"<!--                 <li>\n" +
"                <a href=\"testChart.jsp\">\n" +
"                  <i class=\"bi bi-circle\"></i>\n" +
"                  <span>TestChart</span>\n" +
"                </a>\n" +
"              </li> front office -->\n" +
"                <li>\n" +
"                <a href=\"RechercheBenefice.jsp\">\n" +
"                  <i class=\"bi bi-circle\"></i>\n" +
"                  <span>Benefice</span>\n" +
"                </a>\n" +
"              </li><!-- front office -->\n" +
"              <li >\n" +
"                <a href=\"page-recherche-poketra.jsp\">\n" +
"                 <i class=\"bi bi-circle\"></i>\n" +
"                  <span>Mitady poketra</span>\n" +
"                </a>\n" +
"              </li><!-- front office -->\n" +
"                <li>\n" +
"               <a  href=\"FiltreProduitFinie.jsp\">\n" +
"                <i class=\"bi bi-circle\"></i>\n" +
"                 <span>Filtre  Produit Finie</span>\n" +
"               </a>\n" +
"             </li>\n" +
"             <li class=\"nav-item\">\n" +
"                  <a  href=\"getStat.jsp\">\n" +
"                    <i class=\"bi bi-circle\"></i>\n" +
"                    <span>Statistique</span>\n" +
"                  </a>\n" +
"             </li><!-- front office -->\n" +
"        </ul>\n" +
"      </li><!-- End Tables Nav -->\n" +
"    </ul>\n" +
"\n" +
"  </aside><!-- End Sidebar-->\n" +
"";
    }
}
