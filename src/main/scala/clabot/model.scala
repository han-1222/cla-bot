/**
 * PROPRIETARY AND CONFIDENTIAL
 *
 * Unauthorized copying of this file via any medium is strictly prohibited.
 *
 * Copyright (c) 2017-2017 Snowplow Analytics Ltd. All rights reserved.
 */
package com.snowplowanalytics.srs

import github4s.free.domain.PullRequest

object model {
  /**
   * Event emitted by the github hooks for pull request.
   * @param action which triggered the event, can be opened, reopened, synchronized, closed
   * @param number of the pull request
   * @param pull_request data about the PR in a Github4s' PullRequest
   */
  case class PullRequestEvent(
    action: String,
    number: Int,
    pull_request: PullRequest
  )

  /**
   * Internal representation of a PR with only the necessary components.
   * @param owner of the repository
   * @param repo name of the repository
   * @param number of the pull pull request
   * @param sha of the commit at the PR's head
   */
  case class PR(
    owner: String,
    repo: String,
    number: Int,
    sha: String
  )
}