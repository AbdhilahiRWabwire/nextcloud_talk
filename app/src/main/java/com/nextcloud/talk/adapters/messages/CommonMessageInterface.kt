/*
 * Nextcloud Talk - Android Client
 *
 * SPDX-FileCopyrightText: 2022 Marcel Hibbe <dev@mhibbe.de>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */
package com.nextcloud.talk.adapters.messages

import com.nextcloud.talk.chat.data.model.ChatMessage

interface CommonMessageInterface {
    fun onLongClickReactions(chatMessage: ChatMessage)
    fun onClickReaction(chatMessage: ChatMessage, emoji: String)
    fun onOpenMessageActionsDialog(chatMessage: ChatMessage)
}
