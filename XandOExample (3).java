public TicTacToeGame() {
        JOptionPane.showMessageDialog(null, "Welcome to Tic Tac Toe!\nPlayer 1 = 🦁, Player 2 = 🐺");

        setTitle("Tic Tac Toe - Lion vs Wolf");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 3));
