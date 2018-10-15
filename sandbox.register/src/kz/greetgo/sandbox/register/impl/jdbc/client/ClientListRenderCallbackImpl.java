package kz.greetgo.sandbox.register.impl.jdbc.client;

import kz.greetgo.sandbox.controller.model.ClientToFilter;
import kz.greetgo.sandbox.controller.report.ClientReportView;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ClientListRenderCallbackImpl extends ClientListCallbackAbstract<Void> {

  private final ClientReportView view;

  public ClientListRenderCallbackImpl(ClientToFilter filter, ClientReportView view) {
    super(filter);
    this.view = view;
  }

  @Override
  public Void doInConnection(Connection con) throws Exception {
    prepareSql();

    try (PreparedStatement ps = con.prepareStatement(sql.toString())) {
      for (int i = 1; i <= params.size(); i++) {
        ps.setObject(i, params.get(i - 1));
      }

      try (ResultSet rs = ps.executeQuery()) {
        while (rs.next()) {
          view.addRow(fromRs(rs));
        }
      }
    }

    return null;
  }
}