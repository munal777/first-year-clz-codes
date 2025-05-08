let gameContainer = document.querySelector('.container');
let boxes = document.querySelectorAll('.box');
let resetBtn = document.querySelector('#reset-btn');
let newGameBtn = document.querySelector('#new-btn');
let msgContainer = document.querySelector('.msg-container');
let msg = document.querySelector('#msg');

let player_O = true;

let count_for_draw = 0;

const arr = [
    [0, 1, 2],
    [0, 3, 6],
    [0, 4, 8],
    [1, 4, 7],
    [2, 5, 8],
    [2, 4, 6],
    [3, 4, 5],
    [6, 7, 8]
]

//when player click the button this function work
boxes.forEach(function myfunction(box) {
    box.addEventListener('click', () => {
            if (player_O) {
                box.innerText = 'O';
                player_O = false;
            }
            else {
                box.innerText = 'X';
                player_O = true;
            }
            box.disabled = true;
            count_for_draw++;
            let isWinner = check_winner();

            if (count_for_draw == 9 && !isWinner)
            {
                show_draw();
            }
        });
});

const check_winner = () => {
    for(let each of arr)
    {
        let val_1 = boxes[each[0]].innerText;
        let val_2 = boxes[each[1]].innerText;
        let val_3 = boxes[each[2]].innerText;
        
        if (val_1 != '' && val_2 != '' && val_3 != '')
        {
            if (val_1 == val_2 && val_2 == val_3)
            {
                show_winner(val_1);
                return true;
            }
        }
    }
    return false;
};

const show_draw = () => {
    msg.innerText = 'Game is draw.';
    msgContainer.classList.remove('hide');
    gameContainer.style.display = 'none';
    disable_btn();
};

const show_winner = (winner_val) => {
    let winner_msg = `Congratulations, Player <span style='color: #F2E5BF;'>${winner_val}</span> is the Winner.`;
    msg.innerHTML = winner_msg;
    msgContainer.classList.remove('hide');
    gameContainer.style.display = 'none';
    disable_btn();
};

//after winning the remaining button will be unclickable
disable_btn = () => {
    boxes.forEach((box) => {
        box.disabled = true;
    })
};

enable_btn = () => {
    boxes.forEach( box => {
        box.disabled = false;
        box.innerText = '';
    })
};

const reset_game_btn = () => {
    player_O = true;
    enable_btn();
    msgContainer.classList.add('hide');
    gameContainer.style.display = 'flex';
    count_for_draw = 0;
};

newGameBtn.addEventListener('click',reset_game_btn);
resetBtn.addEventListener('click',reset_game_btn);