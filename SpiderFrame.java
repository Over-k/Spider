package Spider;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.IOException;
import java.net.ProxySelector;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.Document;

public class SpiderFrame extends javax.swing.JFrame {

    public SpiderFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        UserAgentSettings = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnApplyUA = new javax.swing.JButton();
        chromeCheckBox = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        edgeCheckBox = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        firefoxCheckBox = new javax.swing.JCheckBox();
        operaCheckBox = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        safariCheckBox = new javax.swing.JCheckBox();
        internetExplorerCheckBox = new javax.swing.JCheckBox();
        androidWebkitCheckBox = new javax.swing.JCheckBox();
        count_ua = new javax.swing.JLabel();
        btnSelectUserAgentsLocal = new javax.swing.JButton();
        btnCloseDialogAU = new javax.swing.JButton();
        ProxySettings = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnGetProxysOnline = new javax.swing.JButton();
        pendinProxy = new javax.swing.JLabel();
        btnGetProxysLocal = new javax.swing.JButton();
        btnCheckProxy = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        displayProxy = new javax.swing.JTextPane();
        jLabel12 = new javax.swing.JLabel();
        btnCloseProxyDialog = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        validProxy = new javax.swing.JLabel();
        invalidProxy = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        displayValidProxy = new javax.swing.JTextPane();
        jLabel14 = new javax.swing.JLabel();
        btnCopieProxy = new javax.swing.JButton();
        btnDownloadProxy = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        inputPorxyURL = new javax.swing.JTextField();
        index = new javax.swing.JPanel();
        btn_checkURL = new javax.swing.JButton();
        inputTargetURL = new javax.swing.JTextField();
        checkboxTakeScreenshoot = new javax.swing.JCheckBox();
        checkboxSaveWebsite = new javax.swing.JCheckBox();
        checkboxTakeTurn = new javax.swing.JCheckBox();
        btnSaveDir = new javax.swing.JButton();
        btnScreenshootDir = new javax.swing.JButton();
        btnRun = new javax.swing.JButton();
        inputScreenshootDir = new javax.swing.JTextField();
        inputSaveDir = new javax.swing.JTextField();
        reqOption = new javax.swing.JPanel();
        btnSelectUserAgents = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        displayUserAgents = new javax.swing.JTextArea();
        label2 = new java.awt.Label();
        label4 = new java.awt.Label();
        label3 = new java.awt.Label();
        useProxys = new javax.swing.JCheckBox();
        nReq = new javax.swing.JTextField();
        nSec = new javax.swing.JTextField();
        maxReq = new javax.swing.JTextField();
        btnSelectProxys = new javax.swing.JButton();
        btnSendReq = new javax.swing.JButton();
        displayHTLMandBrowser = new javax.swing.JPanel();
        btnDownloadImages = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        displayPreview = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        browserDisplay = new javax.swing.JEditorPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        messagesLog = new javax.swing.JScrollPane();
        console = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        btnClearConsole = new javax.swing.JButton();
        btnStopThread = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        btnRestart = new javax.swing.JButton();

        UserAgentSettings.setTitle("UserAgents Settings");
        UserAgentSettings.setMinimumSize(new java.awt.Dimension(340, 555));
        UserAgentSettings.setResizable(false);
        UserAgentSettings.setType(java.awt.Window.Type.POPUP);

        jPanel2.setBackground(new java.awt.Color(22, 27, 34));
        jPanel2.setForeground(new java.awt.Color(198, 205, 213));
        jPanel2.setPreferredSize(new java.awt.Dimension(333, 550));

        btnApplyUA.setBackground(new java.awt.Color(33, 38, 45));
        btnApplyUA.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnApplyUA.setForeground(new java.awt.Color(236, 242, 248));
        btnApplyUA.setText("Apply");
        btnApplyUA.setBorder(null);
        btnApplyUA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnApplyUAMouseClicked(evt);
            }
        });

        chromeCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chromeCheckBox.setForeground(new java.awt.Color(236, 242, 248));
        chromeCheckBox.setSelected(true);
        chromeCheckBox.setText("Chrome");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(236, 242, 248));
        jLabel4.setText("(List-of-user-agents/Chrome.txt)");

        edgeCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        edgeCheckBox.setForeground(new java.awt.Color(236, 242, 248));
        edgeCheckBox.setSelected(true);
        edgeCheckBox.setText("Edge");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(236, 242, 248));
        jLabel5.setText("(List-of-user-agents/Edge.txt)");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(236, 242, 248));
        jLabel6.setText("(List-of-user-agents/Fifefox.txt)");

        firefoxCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        firefoxCheckBox.setForeground(new java.awt.Color(236, 242, 248));
        firefoxCheckBox.setSelected(true);
        firefoxCheckBox.setText("Firefox");

        operaCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        operaCheckBox.setForeground(new java.awt.Color(236, 242, 248));
        operaCheckBox.setSelected(true);
        operaCheckBox.setText("Opera");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(236, 242, 248));
        jLabel7.setText("(List-of-user-agents/Opera.txt)");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(236, 242, 248));
        jLabel8.setText("(List-of-user-agents/Safari.txt)");

        safariCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        safariCheckBox.setForeground(new java.awt.Color(236, 242, 248));
        safariCheckBox.setSelected(true);
        safariCheckBox.setText("Safari");

        internetExplorerCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        internetExplorerCheckBox.setForeground(new java.awt.Color(236, 242, 248));
        internetExplorerCheckBox.setSelected(true);
        internetExplorerCheckBox.setText("Internet Explorer");
        internetExplorerCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                internetExplorerCheckBoxActionPerformed(evt);
            }
        });

        androidWebkitCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        androidWebkitCheckBox.setForeground(new java.awt.Color(236, 242, 248));
        androidWebkitCheckBox.setSelected(true);
        androidWebkitCheckBox.setText("Android Webkit Browser");

        count_ua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        count_ua.setForeground(new java.awt.Color(236, 242, 248));
        count_ua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        count_ua.setText("0 of userAgents");

        btnSelectUserAgentsLocal.setBackground(new java.awt.Color(33, 38, 45));
        btnSelectUserAgentsLocal.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnSelectUserAgentsLocal.setForeground(new java.awt.Color(236, 242, 248));
        btnSelectUserAgentsLocal.setText("Load from local");
        btnSelectUserAgentsLocal.setBorder(null);
        btnSelectUserAgentsLocal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSelectUserAgentsLocalMouseClicked(evt);
            }
        });

        btnCloseDialogAU.setBackground(new java.awt.Color(37, 186, 0));
        btnCloseDialogAU.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnCloseDialogAU.setForeground(new java.awt.Color(236, 242, 248));
        btnCloseDialogAU.setText("Colse");
        btnCloseDialogAU.setBorder(null);
        btnCloseDialogAU.setPreferredSize(new java.awt.Dimension(32, 20));
        btnCloseDialogAU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseDialogAUMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(btnSelectUserAgentsLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnApplyUA, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCloseDialogAU, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(androidWebkitCheckBox)
                    .addComponent(internetExplorerCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(safariCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(operaCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(firefoxCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(edgeCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(chromeCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(count_ua, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chromeCheckBox)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edgeCheckBox)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firefoxCheckBox)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(operaCheckBox)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(safariCheckBox)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(internetExplorerCheckBox)
                .addGap(18, 18, 18)
                .addComponent(androidWebkitCheckBox)
                .addGap(30, 30, 30)
                .addComponent(btnApplyUA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnSelectUserAgentsLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(count_ua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCloseDialogAU, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout UserAgentSettingsLayout = new javax.swing.GroupLayout(UserAgentSettings.getContentPane());
        UserAgentSettings.getContentPane().setLayout(UserAgentSettingsLayout);
        UserAgentSettingsLayout.setHorizontalGroup(
            UserAgentSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        UserAgentSettingsLayout.setVerticalGroup(
            UserAgentSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserAgentSettingsLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ProxySettings.setTitle("Proxys Settings");
        ProxySettings.setForeground(new java.awt.Color(0, 0, 0));
        ProxySettings.setMinimumSize(new java.awt.Dimension(490, 560));
        ProxySettings.setType(java.awt.Window.Type.POPUP);

        jPanel3.setMaximumSize(new java.awt.Dimension(470, 560));
        jPanel3.setMinimumSize(new java.awt.Dimension(470, 560));
        jPanel3.setPreferredSize(new java.awt.Dimension(475, 560));

        jPanel4.setBackground(new java.awt.Color(22, 27, 34));
        jPanel4.setForeground(new java.awt.Color(236, 242, 248));
        jPanel4.setToolTipText("");
        jPanel4.setMaximumSize(new java.awt.Dimension(470, 528));
        jPanel4.setMinimumSize(new java.awt.Dimension(470, 528));
        jPanel4.setPreferredSize(new java.awt.Dimension(470, 528));

        btnGetProxysOnline.setBackground(new java.awt.Color(33, 38, 45));
        btnGetProxysOnline.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnGetProxysOnline.setForeground(new java.awt.Color(236, 242, 248));
        btnGetProxysOnline.setText("Get Proxys From URL");
        btnGetProxysOnline.setBorder(null);
        btnGetProxysOnline.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGetProxysOnlineMouseClicked(evt);
            }
        });

        pendinProxy.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pendinProxy.setForeground(new java.awt.Color(236, 242, 248));
        pendinProxy.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pendinProxy.setText("0 Pending poxy's");

        btnGetProxysLocal.setBackground(new java.awt.Color(33, 38, 45));
        btnGetProxysLocal.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnGetProxysLocal.setForeground(new java.awt.Color(236, 242, 248));
        btnGetProxysLocal.setText("Upload Proxys");
        btnGetProxysLocal.setBorder(null);
        btnGetProxysLocal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGetProxysLocalMouseClicked(evt);
            }
        });

        btnCheckProxy.setBackground(new java.awt.Color(37, 186, 0));
        btnCheckProxy.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnCheckProxy.setForeground(new java.awt.Color(236, 242, 248));
        btnCheckProxy.setText("Check Proxys");
        btnCheckProxy.setBorder(null);
        btnCheckProxy.setPreferredSize(new java.awt.Dimension(32, 20));
        btnCheckProxy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCheckProxyMouseClicked(evt);
            }
        });

        displayProxy.setBackground(new java.awt.Color(33, 38, 45));
        jScrollPane6.setViewportView(displayProxy);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(236, 242, 248));
        jLabel12.setText("URL:");

        btnCloseProxyDialog.setBackground(new java.awt.Color(37, 186, 0));
        btnCloseProxyDialog.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnCloseProxyDialog.setForeground(new java.awt.Color(236, 242, 248));
        btnCloseProxyDialog.setText("Save and Colse");
        btnCloseProxyDialog.setBorder(null);
        btnCloseProxyDialog.setPreferredSize(new java.awt.Dimension(32, 20));
        btnCloseProxyDialog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseProxyDialogMouseClicked(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(33, 38, 45));
        jLabel9.setForeground(new java.awt.Color(236, 242, 248));
        jLabel9.setText("- Only HTTP");
        jLabel9.setToolTipText("");

        jLabel10.setBackground(new java.awt.Color(33, 38, 45));
        jLabel10.setForeground(new java.awt.Color(236, 242, 248));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("- Respect this formate \"x.x.x.x:xxx\"");
        jLabel10.setToolTipText("");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel13.setBackground(new java.awt.Color(33, 38, 45));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(236, 242, 248));
        jLabel13.setText("Note :");

        validProxy.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        validProxy.setForeground(new java.awt.Color(236, 242, 248));
        validProxy.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        validProxy.setText("0 Valid proxy's    ");

        invalidProxy.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        invalidProxy.setForeground(new java.awt.Color(236, 242, 248));
        invalidProxy.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        invalidProxy.setText("0 Invalid proxy's");

        displayValidProxy.setEditable(false);
        displayValidProxy.setBackground(new java.awt.Color(33, 38, 45));
        jScrollPane7.setViewportView(displayValidProxy);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(236, 242, 248));
        jLabel14.setText("Valid Proxys");

        btnCopieProxy.setBackground(new java.awt.Color(33, 38, 45));
        btnCopieProxy.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnCopieProxy.setForeground(new java.awt.Color(236, 242, 248));
        btnCopieProxy.setText("Copie");
        btnCopieProxy.setBorder(null);
        btnCopieProxy.setPreferredSize(new java.awt.Dimension(32, 20));
        btnCopieProxy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCopieProxyMouseClicked(evt);
            }
        });

        btnDownloadProxy.setBackground(new java.awt.Color(33, 38, 45));
        btnDownloadProxy.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnDownloadProxy.setForeground(new java.awt.Color(236, 242, 248));
        btnDownloadProxy.setText("Download");
        btnDownloadProxy.setBorder(null);
        btnDownloadProxy.setPreferredSize(new java.awt.Dimension(32, 20));
        btnDownloadProxy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDownloadProxyMouseClicked(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(33, 38, 45));
        jLabel11.setForeground(new java.awt.Color(236, 242, 248));
        jLabel11.setText("(1) - Please enter URL if have list online and click on \"Get Porxys From URL\"");

        jLabel15.setBackground(new java.awt.Color(33, 38, 45));
        jLabel15.setForeground(new java.awt.Color(236, 242, 248));
        jLabel15.setText("      - Or click on \"Uploud Proxys\"  if have it already list in local");

        jLabel16.setBackground(new java.awt.Color(33, 38, 45));
        jLabel16.setForeground(new java.awt.Color(236, 242, 248));
        jLabel16.setText("(2) - Click on \"Save and Download\"");

        inputPorxyURL.setBackground(new java.awt.Color(22, 27, 34));
        inputPorxyURL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        inputPorxyURL.setForeground(new java.awt.Color(236, 242, 248));
        inputPorxyURL.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        inputPorxyURL.setText("https://api.proxyscrape.com/v3/free-proxy-list/get?request=displayproxies&protocol=http&country=all&proxy_format=ipport&format=text");
        inputPorxyURL.setBorder(null);
        inputPorxyURL.setSelectionColor(new java.awt.Color(137, 146, 155));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputPorxyURL, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGetProxysOnline, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(btnGetProxysLocal, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(btnCheckProxy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                            .addComponent(jScrollPane7)
                            .addComponent(btnCopieProxy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDownloadProxy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(pendinProxy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(validProxy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(invalidProxy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(btnCloseProxyDialog, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnGetProxysLocal, btnGetProxysOnline, jLabel10, jLabel13, jLabel9, jScrollPane6});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(inputPorxyURL, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pendinProxy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(validProxy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(invalidProxy)
                        .addGap(18, 18, 18)
                        .addComponent(btnCopieProxy, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDownloadProxy, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGetProxysOnline, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGetProxysLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCheckProxy, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnCloseProxyDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jLabel10.getAccessibleContext().setAccessibleName("- Respect this formate \"x.x.x.x:xxx\"\n    in each line");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ProxySettingsLayout = new javax.swing.GroupLayout(ProxySettings.getContentPane());
        ProxySettings.getContentPane().setLayout(ProxySettingsLayout);
        ProxySettingsLayout.setHorizontalGroup(
            ProxySettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );
        ProxySettingsLayout.setVerticalGroup(
            ProxySettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Spider w/ over-k");
        setBackground(new java.awt.Color(0, 0, 51));

        index.setBackground(new java.awt.Color(13, 17, 23));
        index.setMaximumSize(new java.awt.Dimension(1189, 673));

        btn_checkURL.setBackground(new java.awt.Color(37, 186, 0));
        btn_checkURL.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btn_checkURL.setForeground(new java.awt.Color(236, 242, 248));
        btn_checkURL.setText("Check");
        btn_checkURL.setBorder(null);
        btn_checkURL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_checkURLMouseClicked(evt);
            }
        });

        inputTargetURL.setBackground(new java.awt.Color(22, 27, 34));
        inputTargetURL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        inputTargetURL.setForeground(new java.awt.Color(236, 242, 248));
        inputTargetURL.setText("http://127.0.0.1:5500/");
        inputTargetURL.setBorder(null);
        inputTargetURL.setSelectionColor(new java.awt.Color(137, 146, 155));

        checkboxTakeScreenshoot.setBackground(new java.awt.Color(13, 17, 23));
        checkboxTakeScreenshoot.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkboxTakeScreenshoot.setForeground(new java.awt.Color(236, 242, 248));
        checkboxTakeScreenshoot.setText("Take Screenshot");
        checkboxTakeScreenshoot.setBorder(null);

        checkboxSaveWebsite.setBackground(new java.awt.Color(13, 17, 23));
        checkboxSaveWebsite.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkboxSaveWebsite.setForeground(new java.awt.Color(236, 242, 248));
        checkboxSaveWebsite.setText("Save Website");
        checkboxSaveWebsite.setBorder(null);

        checkboxTakeTurn.setBackground(new java.awt.Color(13, 17, 23));
        checkboxTakeTurn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkboxTakeTurn.setForeground(new java.awt.Color(236, 242, 248));
        checkboxTakeTurn.setText("Take Turn");
        checkboxTakeTurn.setBorder(null);

        btnSaveDir.setBackground(new java.awt.Color(33, 38, 45));
        btnSaveDir.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnSaveDir.setForeground(new java.awt.Color(236, 242, 248));
        btnSaveDir.setText("Save to");
        btnSaveDir.setBorder(null);
        btnSaveDir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveDirMouseClicked(evt);
            }
        });

        btnScreenshootDir.setBackground(new java.awt.Color(33, 38, 45));
        btnScreenshootDir.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnScreenshootDir.setForeground(new java.awt.Color(236, 242, 248));
        btnScreenshootDir.setText("Save to");
        btnScreenshootDir.setBorder(null);
        btnScreenshootDir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnScreenshootDirMouseClicked(evt);
            }
        });

        btnRun.setBackground(new java.awt.Color(37, 186, 0));
        btnRun.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRun.setForeground(new java.awt.Color(236, 242, 248));
        btnRun.setText("Run");
        btnRun.setBorder(null);
        btnRun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRunMouseClicked(evt);
            }
        });

        inputScreenshootDir.setBackground(new java.awt.Color(22, 27, 34));
        inputScreenshootDir.setForeground(new java.awt.Color(236, 242, 248));
        inputScreenshootDir.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        inputScreenshootDir.setBorder(null);
        inputScreenshootDir.setMaximumSize(new java.awt.Dimension(64, 14));
        inputScreenshootDir.setMinimumSize(new java.awt.Dimension(64, 14));
        inputScreenshootDir.setSelectionColor(new java.awt.Color(204, 204, 204));

        inputSaveDir.setBackground(new java.awt.Color(22, 27, 34));
        inputSaveDir.setForeground(new java.awt.Color(236, 242, 248));
        inputSaveDir.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        inputSaveDir.setBorder(null);
        inputSaveDir.setMaximumSize(new java.awt.Dimension(64, 14));
        inputSaveDir.setMinimumSize(new java.awt.Dimension(64, 14));
        inputSaveDir.setSelectionColor(new java.awt.Color(204, 204, 204));
        inputSaveDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSaveDirActionPerformed(evt);
            }
        });

        reqOption.setBackground(new java.awt.Color(22, 27, 34));
        reqOption.setForeground(new java.awt.Color(198, 205, 213));

        btnSelectUserAgents.setBackground(new java.awt.Color(33, 38, 45));
        btnSelectUserAgents.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnSelectUserAgents.setForeground(new java.awt.Color(236, 242, 248));
        btnSelectUserAgents.setText("Import userAgents");
        btnSelectUserAgents.setBorder(null);
        btnSelectUserAgents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSelectUserAgentsMouseClicked(evt);
            }
        });

        displayUserAgents.setEditable(false);
        displayUserAgents.setBackground(new java.awt.Color(33, 38, 45));
        displayUserAgents.setColumns(20);
        displayUserAgents.setForeground(new java.awt.Color(236, 242, 248));
        displayUserAgents.setLineWrap(true);
        displayUserAgents.setRows(5);
        displayUserAgents.setText("\n");
        displayUserAgents.setBorder(null);
        jScrollPane2.setViewportView(displayUserAgents);

        label2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label2.setForeground(new java.awt.Color(236, 242, 248));
        label2.setText(" Number of requests");

        label4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label4.setForeground(new java.awt.Color(236, 242, 248));
        label4.setText("Maximum of requests");

        label3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label3.setForeground(new java.awt.Color(236, 242, 248));
        label3.setText("In seconds");

        useProxys.setForeground(new java.awt.Color(204, 204, 204));
        useProxys.setText("send with proxys");

        nReq.setBackground(new java.awt.Color(33, 38, 45));
        nReq.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nReq.setForeground(new java.awt.Color(236, 242, 248));
        nReq.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        nReq.setText("10");
        nReq.setBorder(null);
        nReq.setSelectionColor(new java.awt.Color(204, 204, 204));

        nSec.setBackground(new java.awt.Color(33, 38, 45));
        nSec.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nSec.setForeground(new java.awt.Color(236, 242, 248));
        nSec.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        nSec.setText("1");
        nSec.setBorder(null);
        nSec.setSelectionColor(new java.awt.Color(204, 204, 204));

        maxReq.setBackground(new java.awt.Color(33, 38, 45));
        maxReq.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        maxReq.setForeground(new java.awt.Color(236, 242, 248));
        maxReq.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        maxReq.setText("100");
        maxReq.setBorder(null);
        maxReq.setSelectionColor(new java.awt.Color(204, 204, 204));

        btnSelectProxys.setBackground(new java.awt.Color(33, 38, 45));
        btnSelectProxys.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnSelectProxys.setForeground(new java.awt.Color(236, 242, 248));
        btnSelectProxys.setText("import Proxys");
        btnSelectProxys.setBorder(null);
        btnSelectProxys.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSelectProxysMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout reqOptionLayout = new javax.swing.GroupLayout(reqOption);
        reqOption.setLayout(reqOptionLayout);
        reqOptionLayout.setHorizontalGroup(
            reqOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reqOptionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(reqOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                    .addGroup(reqOptionLayout.createSequentialGroup()
                        .addGroup(reqOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(reqOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nSec, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(nReq, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addComponent(useProxys, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(reqOptionLayout.createSequentialGroup()
                        .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(maxReq, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reqOptionLayout.createSequentialGroup()
                        .addComponent(btnSelectProxys, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSelectUserAgents, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        reqOptionLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {maxReq, nReq, nSec});

        reqOptionLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnSelectProxys, btnSelectUserAgents});

        reqOptionLayout.setVerticalGroup(
            reqOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reqOptionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(reqOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelectUserAgents, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelectProxys, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addGap(15, 15, 15)
                .addGroup(reqOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nReq))
                .addGap(15, 15, 15)
                .addGroup(reqOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nSec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(reqOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maxReq, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(useProxys)
                .addContainerGap())
        );

        reqOptionLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {maxReq, nReq, nSec});

        btnSendReq.setBackground(new java.awt.Color(37, 186, 0));
        btnSendReq.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnSendReq.setForeground(new java.awt.Color(236, 242, 248));
        btnSendReq.setText("Send");
        btnSendReq.setBorder(null);
        btnSendReq.setPreferredSize(new java.awt.Dimension(32, 20));
        btnSendReq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSendReqMouseClicked(evt);
            }
        });

        displayHTLMandBrowser.setBackground(new java.awt.Color(22, 27, 34));
        displayHTLMandBrowser.setForeground(new java.awt.Color(255, 255, 255));

        btnDownloadImages.setBackground(new java.awt.Color(33, 38, 45));
        btnDownloadImages.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnDownloadImages.setForeground(new java.awt.Color(236, 242, 248));
        btnDownloadImages.setText("Download all images");
        btnDownloadImages.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDownloadImages.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDownloadImagesMouseClicked(evt);
            }
        });

        displayPreview.setBackground(new java.awt.Color(33, 38, 45));
        displayPreview.setColumns(20);
        displayPreview.setForeground(new java.awt.Color(236, 242, 248));
        displayPreview.setRows(5);
        jScrollPane4.setViewportView(displayPreview);

        browserDisplay.setEditable(false);
        browserDisplay.setBackground(new java.awt.Color(33, 38, 45));
        browserDisplay.setContentType("text/html"); // NOI18N
        browserDisplay.setForeground(new java.awt.Color(255, 255, 255));
        browserDisplay.setCaretColor(new java.awt.Color(255, 255, 255));
        browserDisplay.setHighlighter(null);
        browserDisplay.setMargin(new java.awt.Insets(0, 0, 0, 0));
        browserDisplay.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        browserDisplay.setSelectionColor(new java.awt.Color(33, 38, 45));
        browserDisplay.setVerifyInputWhenFocusTarget(false);
        jScrollPane5.setViewportView(browserDisplay);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(236, 242, 248));
        jLabel1.setText("Browser");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(236, 242, 248));
        jLabel2.setText("Preview");

        javax.swing.GroupLayout displayHTLMandBrowserLayout = new javax.swing.GroupLayout(displayHTLMandBrowser);
        displayHTLMandBrowser.setLayout(displayHTLMandBrowserLayout);
        displayHTLMandBrowserLayout.setHorizontalGroup(
            displayHTLMandBrowserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayHTLMandBrowserLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(displayHTLMandBrowserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDownloadImages, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(displayHTLMandBrowserLayout.createSequentialGroup()
                        .addGroup(displayHTLMandBrowserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(displayHTLMandBrowserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        displayHTLMandBrowserLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane4, jScrollPane5});

        displayHTLMandBrowserLayout.setVerticalGroup(
            displayHTLMandBrowserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayHTLMandBrowserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(displayHTLMandBrowserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(1, 1, 1)
                .addGroup(displayHTLMandBrowserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addGap(32, 32, 32)
                .addComponent(btnDownloadImages, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        console.setEditable(false);
        console.setBackground(new java.awt.Color(13, 17, 23));
        console.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        console.setForeground(new java.awt.Color(119, 189, 251));
        console.setText(" Script kid ;) ");
        messagesLog.setViewportView(console);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(236, 242, 248));
        jLabel3.setText("Console :");

        btnClearConsole.setBackground(new java.awt.Color(33, 38, 45));
        btnClearConsole.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnClearConsole.setForeground(new java.awt.Color(236, 242, 248));
        btnClearConsole.setText("Clear Console");
        btnClearConsole.setBorder(null);
        btnClearConsole.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearConsoleMouseClicked(evt);
            }
        });

        btnStopThread.setBackground(new java.awt.Color(33, 38, 45));
        btnStopThread.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnStopThread.setForeground(new java.awt.Color(236, 242, 248));
        btnStopThread.setText("Stop");
        btnStopThread.setBorder(null);
        btnStopThread.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStopThreadMouseClicked(evt);
            }
        });

        btnHelp.setBackground(new java.awt.Color(55, 122, 251));
        btnHelp.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnHelp.setForeground(new java.awt.Color(236, 242, 248));
        btnHelp.setText("Help");
        btnHelp.setBorder(null);
        btnHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHelpMouseClicked(evt);
            }
        });

        btnRestart.setBackground(new java.awt.Color(33, 38, 45));
        btnRestart.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnRestart.setForeground(new java.awt.Color(236, 242, 248));
        btnRestart.setText("Restart");
        btnRestart.setBorder(null);
        btnRestart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRestartMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout indexLayout = new javax.swing.GroupLayout(index);
        index.setLayout(indexLayout);
        indexLayout.setHorizontalGroup(
            indexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(indexLayout.createSequentialGroup()
                .addGroup(indexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, indexLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_checkURL, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(indexLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(indexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkboxTakeTurn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputTargetURL, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, indexLayout.createSequentialGroup()
                                .addGroup(indexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkboxTakeScreenshoot, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                    .addComponent(checkboxSaveWebsite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(indexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(inputSaveDir, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                    .addComponent(inputScreenshootDir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(indexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSaveDir, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                                    .addComponent(btnScreenshootDir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(indexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnRun, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSendReq, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(reqOption, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addGroup(indexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(displayHTLMandBrowser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, indexLayout.createSequentialGroup()
                        .addComponent(messagesLog)
                        .addGap(18, 18, 18)
                        .addGroup(indexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnClearConsole, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(indexLayout.createSequentialGroup()
                        .addGap(545, 545, 545)
                        .addGroup(indexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnStopThread, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30))
        );
        indexLayout.setVerticalGroup(
            indexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(indexLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(indexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(indexLayout.createSequentialGroup()
                        .addGroup(indexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_checkURL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputTargetURL, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkboxTakeTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(indexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(indexLayout.createSequentialGroup()
                                .addComponent(checkboxTakeScreenshoot, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkboxSaveWebsite, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(indexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(inputSaveDir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSaveDir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(indexLayout.createSequentialGroup()
                                .addGroup(indexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnScreenshootDir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inputScreenshootDir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)))
                        .addGap(10, 10, 10)
                        .addComponent(btnRun, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(reqOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSendReq, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(indexLayout.createSequentialGroup()
                        .addComponent(displayHTLMandBrowser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGroup(indexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(indexLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(messagesLog))
                            .addGroup(indexLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnClearConsole, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnStopThread, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        indexLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {inputSaveDir, inputScreenshootDir});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(index, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(index, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        
    boolean stopThread = false; 
    private void WriteInConsole(String type, String message) {
        if ("success".equals(type)) {
            console.setForeground(new java.awt.Color(124, 227, 139));
        }
        if ("info".equals(type)) {
            console.setForeground(new java.awt.Color(119, 189, 251));
        }
        if ("error".equals(type)) {
            console.setForeground(new java.awt.Color(250, 121, 112));
        }
        message = message + console.getText();
        console.setText(message);

    }
    private void btn_checkURLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_checkURLMouseClicked
        String url = inputTargetURL.getText();
        WriteInConsole("info", "[.] Send Request to (" + url + ")...\n");
        try {
            displayPreview.setText(functions.getContent(url));
            browserDisplay.setPage(url);
            browserDisplay.scrollToReference(url);
        } catch (Exception e) {
            WriteInConsole("error", "[x] : faild to find this URL (" + url + ")\n");
            displayPreview.setText("[x] : faild to find this URL "+url);
            browserDisplay.setText("[x] : faild to find this URL "+url);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_checkURLMouseClicked

    private void btnScreenshootDirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnScreenshootDirMouseClicked
        String Screenshot_dir = functions.getFolderPath();
        inputScreenshootDir.setText(Screenshot_dir);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnScreenshootDirMouseClicked

    private void btnSelectUserAgentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelectUserAgentsMouseClicked
        UserAgentSettings.setVisible(true);
    }//GEN-LAST:event_btnSelectUserAgentsMouseClicked

    private void btnRunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRunMouseClicked

        String url = inputTargetURL.getText();
        if (url == null || "".equals(url)) {
            WriteInConsole("error", "[!] Please Enter URL.\n");
            return;
        }
        try {
            String page = functions.getContent(url);
        } catch (Exception ex) {
            WriteInConsole("error", "[!] Please Enter a valid URL.\n");
            return;
        }
        if (checkboxTakeTurn.isSelected()) {
            try {
                functions.OpenInBrowser(url);
                WriteInConsole("info", "[.] Take turn.\n");
            } catch (URISyntaxException ex) {
            } catch (IOException ex) {
            }

        }
        if (checkboxTakeScreenshoot.isSelected()) {
            String screenshootDir = inputScreenshootDir.getText();
            if (new File(screenshootDir).isDirectory()) {
                try {
                    if (!checkboxTakeTurn.isSelected()) {
                        functions.OpenInBrowser(url);
                    }
                } catch (URISyntaxException ex) {
                } catch (IOException ex) {
                }
                WriteInConsole("info", "[.] "+functions.SaveScreenshoot(screenshootDir));
            } else {
                WriteInConsole("error", "[!] Please Enter Directory where you want to save screenshoot.\n");
            }
        }
        if (checkboxSaveWebsite.isSelected()) {
            try {
                String saveDir = inputSaveDir.getText();
                if (new File(saveDir).isDirectory()) {
                    functions.SaveWebsite(url, saveDir);
                } else {
                    WriteInConsole("error", "[!] Please Enter Directory where you want to save website.\n");
                }

            } catch (Exception ex) {
                Logger.getLogger(SpiderFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            WriteInConsole("info", "[.] Website saved to "+inputSaveDir.getText()+".\n");
        }

    }//GEN-LAST:event_btnRunMouseClicked

    private void btnSendReqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSendReqMouseClicked
        // TODO add your handling code here:

        String url = inputTargetURL.getText();
        int num = Integer.parseInt(nReq.getText().trim());
        int sec = Integer.parseInt(nSec.getText().trim()) * 1000;
        int max = Integer.parseInt(maxReq.getText().trim());

        try {
            functions.getContent(url);
        } catch (Exception e) {
            WriteInConsole("error", "[x] Please enter valid URL (" + url + ")\n");
            return;
        }
        stopThread = false;
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                String[] userAgentsList = displayUserAgents.getText().split("\n");
                if (userAgentsList.length < 1) {
                    userAgentsList = null;
                }

                String[] proxysList = null;
                if (useProxys.isSelected()) {
                    try {
                        proxysList = displayValidProxy.getText().split("\n");
                    } catch (Exception ex) {
                        proxysList = null;
                    }
                }
                for (int numReqSend = 0; numReqSend <= max;) {
                    for (int i = 0; i <= num; i++) {
                        try {
                            functions.SendRequests(url, userAgentsList, proxysList);
                        } catch (IOException ex) {
                        }
                        numReqSend++;
                        WriteInConsole("success", "[" + numReqSend + "] SEND TO " + url + ".\n");
                    }
                    try {
                        Thread.sleep(sec);
                    } catch (InterruptedException ex) {
                    }
                    if(stopThread){
                        return;
                    }
                }
            }
        });
        thread.start();
        WriteInConsole("success", "[.] Requests Has been sent(" + maxReq + ").\n");

    }//GEN-LAST:event_btnSendReqMouseClicked

    private void btnDownloadImagesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDownloadImagesMouseClicked
        String dir = functions.getFolderPath();
        String url = inputTargetURL.getText();
        if (new File(dir).isDirectory()) {
            try {
                functions.extractAndDownloadImages(url, dir, functions.getContent(url));
                WriteInConsole("success", "[x] : Download all images from {" + url + "} has been done.\n>>Checkout this directory (" + dir + ")\n");
                // TODO add your handling code here:
            } catch (Exception ex) {
                WriteInConsole("error", "[x] : faild to Download images from {" + url + "}.\n");
            }
        }

    }//GEN-LAST:event_btnDownloadImagesMouseClicked

    private void btnSaveDirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveDirMouseClicked
        // TODO add your handling code here:
        String saveDir = functions.getFolderPath();
        inputSaveDir.setText(saveDir);
    }//GEN-LAST:event_btnSaveDirMouseClicked

    private void inputSaveDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSaveDirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputSaveDirActionPerformed

    private void btnSelectProxysMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelectProxysMouseClicked
        ProxySettings.setVisible(true);
    }//GEN-LAST:event_btnSelectProxysMouseClicked

    private void btnApplyUAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnApplyUAMouseClicked
        String userAgents = "";
        if (chromeCheckBox.isSelected()) {
            userAgents += functions.ReadTextFile("src\\main\\java\\spider\\List-of-user-agents\\Chrome.txt");
        }
        if (edgeCheckBox.isSelected()) {
            userAgents += functions.ReadTextFile("src\\main\\java\\spider\\List-of-user-agents\\Edge.txt");
        }
        if (firefoxCheckBox.isSelected()) {
            userAgents += functions.ReadTextFile("src\\main\\java\\spider\\List-of-user-agents\\Firefox.txt");
        }
        if (operaCheckBox.isSelected()) {
            userAgents += functions.ReadTextFile("src\\main\\java\\spider\\List-of-user-agents\\Opera.txt");
        }
        if (safariCheckBox.isSelected()) {
            userAgents += functions.ReadTextFile("src\\main\\java\\spider\\List-of-user-agents\\Safari.txt");
        }
        if (androidWebkitCheckBox.isSelected()) {
            userAgents += functions.ReadTextFile("src\\main\\java\\spider\\List-of-user-agents\\Android+Webkit+Browser.txt");
        }
        if (internetExplorerCheckBox.isSelected()) {
            userAgents += functions.ReadTextFile("src\\main\\java\\spider\\List-of-user-agents\\internet+Explorer.txt");
        }
        displayUserAgents.setText(userAgents);
        count_ua.setText(userAgents.split("\n").length + " of user agents.");
    }//GEN-LAST:event_btnApplyUAMouseClicked

    private void internetExplorerCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_internetExplorerCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_internetExplorerCheckBoxActionPerformed

    private void btnSelectUserAgentsLocalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelectUserAgentsLocalMouseClicked
        String userAgents = functions.ReadTextFile(functions.getFilePath());
        displayUserAgents.setText(displayUserAgents.getText() + userAgents);
        count_ua.setText(displayUserAgents.getText().split("\n").length + " of user agents.");
    }//GEN-LAST:event_btnSelectUserAgentsLocalMouseClicked

    private void btnCloseDialogAUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseDialogAUMouseClicked
        UserAgentSettings.setVisible(false);
    }//GEN-LAST:event_btnCloseDialogAUMouseClicked

    private void btnGetProxysOnlineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGetProxysOnlineMouseClicked

        try {
            String proxys = functions.getContent(inputPorxyURL.getText());
            displayProxy.setText(proxys);
        } catch (Exception ex) {
        }

    }//GEN-LAST:event_btnGetProxysOnlineMouseClicked

    private void btnGetProxysLocalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGetProxysLocalMouseClicked
        try {
            String proxys = functions.getContent(functions.getFilePath());
            displayProxy.setText(proxys + displayProxy.getText());
        } catch (Exception ex) {
            Logger.getLogger(SpiderFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGetProxysLocalMouseClicked

    private void btnCheckProxyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCheckProxyMouseClicked
        if (displayProxy.getText().trim().split("\n").length < 0) {
            return;
        }
        stopThread = false;
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                String[] proxys = displayProxy.getText().trim().split("\n");
                int valid = 0,
                        invalid = 0;
                for (int i = 0; i < proxys.length; i++) {
                    try {
                        boolean isValid = functions.CheckProxy(proxys[i]);
                        if (isValid) {
                            valid++;
                            displayValidProxy.setText(displayValidProxy.getText() + proxys[i] + "\n");
                        } else {
                            invalid++;
                        }
                    } catch (IOException ex) {
                        invalid++;
                    }
                    if (i % 10 == 0) {
                        try {

                            pendinProxy.setText(proxys.length - (invalid + valid) + " Pending proxy's");
                            validProxy.setText(valid + " Valid proxy's");
                            invalidProxy.setText(invalid + " Invalid proxy's");

                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(SpiderFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    if(stopThread){
                        return;
                    }
                }
            }
        });
        thread.start();
    }//GEN-LAST:event_btnCheckProxyMouseClicked

    private void btnCloseProxyDialogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseProxyDialogMouseClicked
        ProxySettings.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCloseProxyDialogMouseClicked

    private void btnCopieProxyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCopieProxyMouseClicked
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection selection = new StringSelection(displayValidProxy.getText());
        clipboard.setContents(selection, null);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCopieProxyMouseClicked

    private void btnDownloadProxyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDownloadProxyMouseClicked
        String downloadDir = functions.getFolderPath();
        String fileName = "proxys";
        try {
            functions.SaveTextFile(downloadDir, fileName, displayValidProxy.getText());
        } catch (IOException ex) {
            Logger.getLogger(SpiderFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDownloadProxyMouseClicked

    private void btnClearConsoleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearConsoleMouseClicked
        console.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClearConsoleMouseClicked

    private void btnStopThreadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStopThreadMouseClicked
        stopThread=true;
    }//GEN-LAST:event_btnStopThreadMouseClicked

    private void btnHelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHelpMouseClicked
        for(int i=0;i<40;i++){
            console.setText("");
            WriteInConsole("info", "*============================*\n");
            WriteInConsole("info", "|> look-in for this repo in github.com/Over-k/Spider |\n");
            WriteInConsole("info", "*============================*\n");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHelpMouseClicked

    private void btnRestartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestartMouseClicked
        stopThread = true;
        inputTargetURL.setText("");
        inputPorxyURL.setText("");
        inputSaveDir.setText("");
        inputScreenshootDir.setText("");
        displayUserAgents.setText("");
        displayProxy.setText("");
        displayValidProxy.setText("");
        displayPreview.setText("");
        browserDisplay.setText("");
        console.setText("");
                
    }//GEN-LAST:event_btnRestartMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SpiderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SpiderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SpiderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SpiderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SpiderFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame ProxySettings;
    private javax.swing.JFrame UserAgentSettings;
    private javax.swing.JCheckBox androidWebkitCheckBox;
    private javax.swing.JEditorPane browserDisplay;
    private javax.swing.JButton btnApplyUA;
    private javax.swing.JButton btnCheckProxy;
    private javax.swing.JButton btnClearConsole;
    private javax.swing.JButton btnCloseDialogAU;
    private javax.swing.JButton btnCloseProxyDialog;
    private javax.swing.JButton btnCopieProxy;
    private javax.swing.JButton btnDownloadImages;
    private javax.swing.JButton btnDownloadProxy;
    private javax.swing.JButton btnGetProxysLocal;
    private javax.swing.JButton btnGetProxysOnline;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnRestart;
    private javax.swing.JButton btnRun;
    private javax.swing.JButton btnSaveDir;
    private javax.swing.JButton btnScreenshootDir;
    private javax.swing.JButton btnSelectProxys;
    private javax.swing.JButton btnSelectUserAgents;
    private javax.swing.JButton btnSelectUserAgentsLocal;
    private javax.swing.JButton btnSendReq;
    private javax.swing.JButton btnStopThread;
    private javax.swing.JButton btn_checkURL;
    private javax.swing.JCheckBox checkboxSaveWebsite;
    private javax.swing.JCheckBox checkboxTakeScreenshoot;
    private javax.swing.JCheckBox checkboxTakeTurn;
    private javax.swing.JCheckBox chromeCheckBox;
    private javax.swing.JTextPane console;
    private javax.swing.JLabel count_ua;
    private javax.swing.JPanel displayHTLMandBrowser;
    private javax.swing.JTextArea displayPreview;
    private javax.swing.JTextPane displayProxy;
    private javax.swing.JTextArea displayUserAgents;
    private javax.swing.JTextPane displayValidProxy;
    private javax.swing.JCheckBox edgeCheckBox;
    private javax.swing.JCheckBox firefoxCheckBox;
    private javax.swing.JPanel index;
    private javax.swing.JTextField inputPorxyURL;
    private javax.swing.JTextField inputSaveDir;
    private javax.swing.JTextField inputScreenshootDir;
    private javax.swing.JTextField inputTargetURL;
    private javax.swing.JCheckBox internetExplorerCheckBox;
    private javax.swing.JLabel invalidProxy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private javax.swing.JTextField maxReq;
    private javax.swing.JScrollPane messagesLog;
    private javax.swing.JTextField nReq;
    private javax.swing.JTextField nSec;
    private javax.swing.JCheckBox operaCheckBox;
    private javax.swing.JLabel pendinProxy;
    private javax.swing.JPanel reqOption;
    private javax.swing.JCheckBox safariCheckBox;
    private javax.swing.JCheckBox useProxys;
    private javax.swing.JLabel validProxy;
    // End of variables declaration//GEN-END:variables
}
