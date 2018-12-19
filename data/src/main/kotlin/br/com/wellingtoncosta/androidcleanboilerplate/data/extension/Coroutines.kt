package br.com.wellingtoncosta.androidcleanboilerplate.data.extension

import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

/**
 * @author Wellington Costa on 19/12/2018.
 **/

suspend fun <T> runJobOnIo(action: suspend () -> T) {
    coroutineScope { launch(IO) { action() } }
}

suspend fun <T> runAsyncOnIo(action: suspend () -> T): T {
    return coroutineScope { async(IO) { action() }.await() }
}