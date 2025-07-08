 for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton("");
            buttons[i].setFont(new Font("SansSerif", Font.PLAIN, 60));
            buttons[i].addActionListener(this);
            add(buttons[i]);
        }

        setLocationRelativeTo(null);
        setVisible(true);
    }
