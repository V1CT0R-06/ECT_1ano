// Dados do gráfico
const data = {
    labels: [
        'Doenças Gengivais',
        'Obesidade',
        'Doença Dentaria',
        'Unhas muito grandes',
        'Problemas com Parasitas',
        'Doenças cardiacas',
    ],
    datasets: [{
        label: 'Saúde dos Gatos',
        data: [15.23, 11.58, 9.23, 5.23, 5.07, 4.44], // Porcentagens fictícias
        backgroundColor: [
            'rgba(255, 159, 64, 0.7)',
            'rgba(75, 192, 192, 0.7)',
            'rgba(153, 102, 255, 0.7)',
            'rgba(201, 203, 207, 0.7)',
            'rgba(255, 205, 86, 0.7)',
            'rgba(248, 21, 21, 0.6)',
        ],
        borderColor: [
            'rgba(255, 159, 64, 1)',
            'rgba(75, 192, 192, 1)',
            'rgba(153, 102, 255, 1)',
            'rgba(201, 203, 207, 1)',
            'rgba(255, 205, 86, 1)',
            'rgba(248, 21, 21, 1)'
        ],
        borderWidth: 1
    }]
};

// Configuração do gráfico
const config = {
    type: 'pie',
    data: data,
    options: {
        responsive: false,
        maintainAspectRatio: false, // Permitir ajuste de proporção
        plugins: {
            legend: {
                position: 'bottom',
                labels: {
                    font: {
                        size: 18 // Aumenta o tamanho da legenda
                    }
                }
            },
        }
    }
};

// Renderizar o gráfico
const chartCanvas = document.getElementById('catHealthChart');
chartCanvas.width = 800; // Aumenta a largura do gráfico
chartCanvas.height = 800; // Aumenta a altura do gráfico
const ctx = chartCanvas.getContext('2d');
new Chart(ctx, config);
